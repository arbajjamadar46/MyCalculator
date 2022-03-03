package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView anstv;
    int a,b;
    String ans;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt( num1.getText().toString());
                b = Integer.parseInt( num2.getText().toString());
                ans=String.valueOf(a+b);
                anstv.setText(ans);

            }
        });
    }

    public void init(){
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        b1 = findViewById(R.id.button);
        anstv = findViewById(R.id.Ans);

    }
}