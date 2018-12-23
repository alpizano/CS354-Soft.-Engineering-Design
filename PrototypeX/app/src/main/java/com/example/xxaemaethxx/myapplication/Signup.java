package com.example.xxaemaethxx.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    EditText name;
    EditText username;
    EditText email;
    EditText pw;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = (EditText) findViewById(R.id.etName);
        username = (EditText) findViewById(R.id.etUsername);
        email = (EditText) findViewById(R.id.etEmail);
        pw = (EditText) findViewById(R.id.etPw);
        submit = (Button) findViewById(R.id.btnSubmit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
