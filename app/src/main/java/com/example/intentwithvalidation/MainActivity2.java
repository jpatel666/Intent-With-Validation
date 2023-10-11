package com.example.intentwithvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvName,tvNumber,tvEmail,tvPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvName= findViewById(R.id.tvName);
        tvNumber= findViewById(R.id.tvNumber);
        tvEmail= findViewById(R.id.tvEmail);
        tvPassword= findViewById(R.id.tvPassword);

        //Method 1
        //Intent intent = getIntent();
        //String name = intent.getStringExtra("name");
        //tvName.setText(name);

        //String number = intent.getStringExtra("number");
        //tvNumber.setText(number);

        //String email = intent.getStringExtra("email");
        //tvEmail.setText(email);

        //String password = intent.getStringExtra("password");
        //tvPassword.setText(password);

        //Method 2
        String name = getIntent().getStringExtra("name");
        tvName.setText(name);

        String number = getIntent().getStringExtra("number");
        tvNumber.setText(number);

        String email = getIntent().getStringExtra("email");
        tvEmail.setText(email);

        String password = getIntent().getStringExtra("password");
        tvPassword.setText(password);

    }
}