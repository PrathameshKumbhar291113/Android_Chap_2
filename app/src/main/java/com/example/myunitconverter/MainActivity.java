package com.example.myunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button myButton;
    private TextView myTextView;
    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.button);
        myTextView = findViewById(R.id.textView2);
        myEditText = findViewById(R.id.editText);
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                Toast.makeText(MainActivity.this, "Value is converted successfully", Toast.LENGTH_SHORT).show();
//            String s =myEditText.getText().toString();1
//            double Kg = Double.parseDouble(s);
//            double Pound = 2.205*Kg;
//            myTextView.setText("The value of Pounds is " + Pound);
//            }
//        });
    }
    public void calculateConversion(View view){
        Toast.makeText(MainActivity.this, "Value is converted successfully", Toast.LENGTH_SHORT).show();
        String s =myEditText.getText().toString();
        double Kg = Double.parseDouble(s);
        double Pound = 2.205*Kg;
        myTextView.setText("The value of Pounds is " + Pound);
    }
}