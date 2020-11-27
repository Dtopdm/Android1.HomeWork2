package com.example.android1homework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edNum1;
    EditText edNum2;
    EditText edNum3;
    TextView result;
    Button btnResult;
    int num1;
    int num2;
    int num3;
    int res;
    private final String KEY1 = "num1";
    private final String KEY2 = "num2";
    private final String KEY3 = "num3";
    private final String RESULT = "res";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNum1 = findViewById(R.id.edNum1);
        edNum2 = findViewById(R.id.edNum2);
        edNum3 = findViewById(R.id.edNum3);
        result = findViewById(R.id.resultSum);
        btnResult = findViewById(R.id.btnResult);

        clickButton();
    }

    public void clickButton(){
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(edNum1.getText().toString());
                num2 = Integer.parseInt(edNum2.getText().toString());
                num3 = Integer.parseInt(edNum3.getText().toString());
                res = (num1 + num2)/num3;
                result.setText(" " + res);

            }
        });


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY1, num1);
        outState.putInt(KEY2, num2);
        outState.putInt(KEY3, num3);
        outState.putInt(RESULT, res);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        num1 = savedInstanceState.getInt(KEY1);
        num2 = savedInstanceState.getInt(KEY2);
        num3 = savedInstanceState.getInt(KEY3);
        res = savedInstanceState.getInt(RESULT);
    }


}