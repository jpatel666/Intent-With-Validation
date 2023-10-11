package com.example.intentwithvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText evName,evNumber,evEmail,evPassword;

    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evName = findViewById(R.id.evName);
        evNumber = findViewById(R.id.evNumber);
        evEmail = findViewById(R.id.evEmail);
        evPassword = findViewById(R.id.evPassword);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = evName.getText().toString().trim();
                String number = evNumber.getText().toString().trim();
                String email = evEmail.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String password = evPassword.getText().toString().trim();
                String passwordUpperLowercase = "[a-zA-Z0-9\\!\\@\\#\\$]{8,24}";


                if(name.isEmpty()){
                    evName.setError("Entre Your Username");

                } else if (number.isEmpty()) {
                    evNumber.setError("Enter Your Mobile Number");

                } else if (number.length() != 10) {
                    evNumber.setError("Enter Your 10 Digits Mobile Number");

                } else if (email.isEmpty()) {
                    evEmail.setError("Enter Your Email");

                } else if (!email.matches(emailPattern)) {
                    evEmail.setError("Invalid Email Address");

                } else if (password.isEmpty()) {
                    evPassword.setError("Enter Your Password");

                } else if (!password.matches(passwordUpperLowercase)) {
                    evPassword.setError("Invalid Password");

                }
                else {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name",evName.getText().toString());
                    intent.putExtra("number",evNumber.getText().toString());
                    intent.putExtra("email",evEmail.getText().toString());
                    intent.putExtra("password",evPassword.getText().toString());

                    startActivity(intent);
                }


            }
        });
    }
}