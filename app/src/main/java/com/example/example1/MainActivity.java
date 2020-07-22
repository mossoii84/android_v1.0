package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView3;
    Button buttonChange;

    CheckBox checkBox;
    TextView txtView;

    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeInvizible(); // changeInvizible
        checkBoxChange(); //checbox
//        addListenerInButton(); //изменение цвета
    }



    //Изменяем цвет надписи или замена текста
    public void changeInvizible(){
        // найдем View-элементы
        textView3 = (TextView)findViewById(R.id.textView3);
        buttonChange = (Button)findViewById(R.id.buttonChange);
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView3.getVisibility() == View.VISIBLE)
                    textView3.setVisibility(View.INVISIBLE);
                else if (textView3.getVisibility() == View.INVISIBLE)
                    textView3.setVisibility(View.GONE);
                else if(textView3.getVisibility() == View.GONE)
                    textView3.setVisibility(View.VISIBLE);
            }
        });
    }



    // checkBox для надписи GOOD
   public void checkBoxChange(){
       txtView = (TextView)findViewById(R.id.good);
       checkBox = (CheckBox) findViewById(R.id.checkBox);
       checkBox.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
          if (checkBox.isChecked())
          {
              txtView.setVisibility(View.INVISIBLE);
          }
          else
          {
              txtView.setVisibility(View.VISIBLE);
          }
           }
       });
}


    // РАБОЧИЙ КОД
    //Изменяем цвет надписи или замена текста
//        public void addListenerInButton(){
//     // найдем View-элементы
//    textView2 = (TextView)findViewById(R.id.textView2);
//    buttonChange = (Button)findViewById(R.id.buttonChange);
//       // создаем обработчик нажатия
//    View.OnClickListener oclBtnOk = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            // Меняем текст в TextView (tvOut)
////            textView2.setText("Нажата кнопка ОК"); //появляется надпись
//            textView2.setTextColor(Color.RED); // меняем цвет текстра
//        }
//    };
//    // присвоим обработчик кнопке OK (btnOk)
//    buttonChange.setOnClickListener(oclBtnOk);
//        }




}