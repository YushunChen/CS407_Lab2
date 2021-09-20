package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void calculate(View view) {
        EditText firstNumberField = (EditText) findViewById(R.id.firstNumberField);
        EditText secondNumberField = (EditText) findViewById(R.id.secondNumberField);
        int firstNumber = Integer.parseInt(firstNumberField.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberField.getText().toString());

        Button b = (Button) view;
        String operation = b.getText().toString();
        int result = 0;

        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals("×")) {
            result = firstNumber * secondNumber;
        } else {
            result = firstNumber / secondNumber;
        }

        goToActivity2(Integer.toString(result));
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}