package com.example.xxaemaethxx.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    EditText name;
    EditText username;
    EditText email;
    EditText pw;
    Button submit;
    TextView viewUserList;
    TextView CheckBtn;
    RadioGroup rGroup;
    RadioButton rBtnStudent;
    RadioButton rBtnTeacher;
    int auth;
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = (EditText) findViewById(R.id.etName);
        username = (EditText) findViewById(R.id.etUsername);
        email = (EditText) findViewById(R.id.etEmail);
        pw = (EditText) findViewById(R.id.etPw);
        viewUserList = (TextView) findViewById(R.id.tvUserList);
        CheckBtn = (TextView) findViewById(R.id.tvCheckBtn);
        submit = (Button) findViewById(R.id.btnSubmit);
        rBtnStudent = (RadioButton) findViewById(R.id.rbtnStudent);
        rBtnTeacher = (RadioButton) findViewById(R.id.rbtnTeacher);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("ADebugTag", "Auth value was: " + String.valueOf(auth) + "when hitting SUBMIT");
                if(auth == 0) {
                    Student s = new Student();

                    s.setName(name.getText().toString());
                    s.setEmail(email.getText().toString());
                    s.setUsername(username.getText().toString());
                    s.setPW(pw.getText().toString());
                    s.setAuth(auth);

                    helper.insertStudent(s);
                    name.setText("");
                    username.setText("");
                    email.setText("");
                    pw.setText("");

                }

                else if(auth == 1) {
                    Teacher t = new Teacher();

                    t.setName(name.getText().toString());
                    t.setEmail(email.getText().toString());
                    t.setUsername(username.getText().toString());
                    t.setPW(pw.getText().toString());
                    t.setAuth(auth);

                    helper.insertTeacher(t);
                    name.setText("");
                    username.setText("");
                    email.setText("");
                    pw.setText("");
                }

            }
        });

        viewUserList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Signup.this, UserList.class);
                startActivity(i);
            }
        });
    }


    public void checkButton(View v) {
        int id = v.getId();
        //int radioID = rGroup.getCheckedRadioButtonId();

        Log.i("ADebugTag", "Value of id: " + String.valueOf(id));
        //Log.i("ADebugTag", "Value of radioID: " + String.valueOf(radioID));



    switch(id) {
        case R.id.rbtnStudent:
            CheckBtn.setText("Student");
            auth = 0;
            break;
        case R.id.rbtnTeacher:
            CheckBtn.setText("Teacher");
            auth = 1;
            break;
    }
    }
}
