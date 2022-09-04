package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CalcFun(View view){
        EditText numTxt1 = findViewById(R.id. numTxt1);
        EditText numTxt2 = findViewById(R.id. numTxt2);
        EditText numTxt3 = findViewById(R.id. numTxt3);
        int num1 = Integer.parseInt(numTxt1.getText().toString());
        int num2 = Integer.parseInt(numTxt2.getText().toString());
        int num3 = num1 + num2;
        numTxt3.setText(Integer.toString(num3));


    }
}
