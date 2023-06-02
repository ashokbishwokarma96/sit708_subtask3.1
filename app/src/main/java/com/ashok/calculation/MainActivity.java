package com.ashok.calculation;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4;
    private TextView tv_result;
    private EditText ed_1, ed_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        ed_1 = findViewById(R.id.txtFirst);
        ed_1.setFilters(new InputFilter[]{new DecimalDigitsInputFilter(2)});
        ed_2 = findViewById(R.id.txtSecond);
        ed_2.setFilters(new InputFilter[]{new DecimalDigitsInputFilter(2)});
        tv_result = findViewById(R.id.result);
//        tv_result.setFilters(new InputFilter[]{new DecimalDigitsInputFilter(2)});


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double firstNumber = Double.parseDouble(ed_1.getText().toString());
                Double secondNumber = Double.parseDouble(ed_2.getText().toString());
                Double result = firstNumber + secondNumber;
                tv_result.setText(result + "");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double firstNumber = Double.parseDouble(ed_1.getText().toString());
                Double secondNumber = Double.parseDouble(ed_2.getText().toString());
                Double result = firstNumber - secondNumber;
                tv_result.setText(result + "");
            }
        });

    }
}