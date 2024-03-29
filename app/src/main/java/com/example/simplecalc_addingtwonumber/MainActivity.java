package com.example.simplecalc_addingtwonumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button Add;
    private TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.etnum1);
        num2 = (EditText)findViewById(R.id.etnum2);
        Add = (Button)findViewById(R.id.btnAdd);
        Answer = (TextView)findViewById(R.id.tvAnswer);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;

                Answer.setText("Answer : " + String.valueOf(sum)) ;

            }
        });
    }
}
