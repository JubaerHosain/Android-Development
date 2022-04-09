package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextFirstValue, editTextSecondValue;
    TextView textViewAnswer;
    Button add, subtract, multiply, divide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstValue = findViewById(R.id.editFirstValue);
        editTextSecondValue = findViewById(R.id.editSecondValue);

        textViewAnswer = findViewById(R.id.textViewAnswer);

        add = findViewById(R.id.buttonAdd);
        subtract = findViewById(R.id.buttonSubtract);
        multiply = findViewById(R.id.buttonMultiply);
        divide = findViewById(R.id.buttonDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstValue, secondValue, answer;
                firstValue = Double.parseDouble(editTextFirstValue.getText().toString());
                secondValue = Double.parseDouble(editTextSecondValue.getText().toString());
                answer = firstValue + secondValue;
                textViewAnswer.setText("Ans is = " + answer);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstValue, secondValue, answer;
                firstValue = Double.parseDouble(editTextFirstValue.getText().toString());
                secondValue = Double.parseDouble(editTextSecondValue.getText().toString());
                answer = firstValue - secondValue;
                textViewAnswer.setText("Ans is = " + answer);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstValue, secondValue, answer;
                firstValue = Double.parseDouble(editTextFirstValue.getText().toString());
                secondValue = Double.parseDouble(editTextSecondValue.getText().toString());
                answer = firstValue * secondValue;
                textViewAnswer.setText("Ans is = " + answer);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstValue, secondValue, answer;
                firstValue = Double.parseDouble(editTextFirstValue.getText().toString());
                secondValue = Double.parseDouble(editTextSecondValue.getText().toString());
                answer = firstValue / secondValue;
                textViewAnswer.setText("Ans is = " + answer);
            }
        });
    }
}