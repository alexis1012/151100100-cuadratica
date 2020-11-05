package com.alexis.cuadratica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.alexis.cuadratica.R.*;

public class MainActivity extends AppCompatActivity {
    EditText val1, val2, val3;
    button b_cal;
    TextView res;
    double a, b, c, d, x1, x2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        val1 = (EditText) findViewById(id.val1);
        val2 = (EditText) findViewById(id.val2);
        val3 = (EditText) findViewById(id.val3);

        b_cal = (button) findViewById(id.b_cal);

        res = (EditText) findViewById(id.res);

        b_cal.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v){
                if(!val1.getText().toString().equals("")&& !val2.getText().toString().equals("")&& !val1.getText().toString().equals("")){
                    a = double.parseDouble(val1.getText().toString());
                    b = double.parseDouble(val2.getText().toString());
                    c = double.parseDouble(val3.getText().toString());

                    d = Math.pow(b, 2) - (4*a*c);

                    if (d==0){
                        x1 = -b / (2*a);
                        res.setText("x1 =" + x1);
                    }else if (d < 0){
                        res.setText("No roots!");
                    }else if (d > 0){
                        x1 = (-b + Math.sqrt(d)) / (2*a);
                        x2 = (-b - Math.sqrt(d)) / (2*a);
                        res.setText("x2 =" + x2);
                    }
                }
            }
        }
    }
}