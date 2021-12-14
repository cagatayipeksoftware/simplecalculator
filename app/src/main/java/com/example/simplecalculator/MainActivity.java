package com.example.simplecalculator;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        textView=findViewById(R.id.textView);



    }

    public void sum(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            textView.setText("Sayı Giriniz");


        } else{
                int number11 = Integer.parseInt(number2.getText().toString());
                int number22 = Integer.parseInt(number2.getText().toString());
                int result = number11+number22;
                textView.setText("Sonuç:" + result);


            }



        }








    public void didact(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
           textView.setText("Sayı Giriniz");
        }else{
            int number11 =Integer.parseInt(number1.getText().toString());
            int number22 = Integer.parseInt(number2.getText().toString());
            int result = number11-number22;
            textView.setText("Sonuç:" + result);
        }


    }


    public void multiply(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            textView.setText("Sayı Giriniz");



        }else{
            int number11=Integer.parseInt(number1.getText().toString());
            int number22=Integer.parseInt(number2.getText().toString());
            int result=number11*number22;
            textView.setText("Sonuç" + result);



        }


    }



    public void divide(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            textView.setText("Sayı Giriniz");
        }else {

            int number11 = Integer.parseInt(number1.getText().toString());
            int number22 = Integer.parseInt(number2.getText().toString());
            int result = number11 / number22;
            textView.setText("Sonuç:" + result);

        }



    }

}