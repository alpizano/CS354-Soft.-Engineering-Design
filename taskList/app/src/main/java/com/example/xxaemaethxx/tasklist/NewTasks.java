package com.example.xxaemaethxx.tasklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewTasks extends AppCompatActivity {

    private EditText Name;
    private EditText Date;
    private EditText Time;
    private Button Add;
    private Button View;

    DatabaseHelper helper = new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tasks);

        Name = (EditText) findViewById(R.id.etName);
        Date = (EditText) findViewById(R.id.etDate);
        Time = (EditText) findViewById(R.id.etTime);
        Add = (Button) findViewById(R.id.btnAdd);
        View = (Button) findViewById(R.id.btnView);


    }

    public void addPressed(View v) {
        String courseName = Name.getText().toString();
        String date = Date.getText().toString();
        String time = Time.getText().toString();

        Courses course = new Courses();

        course.setName(courseName);
        course.setDate(date);
        course.setTime(time);

        helper.addCourses(course);

        // resets Texts
        Name.setText("");
        Date.setText("");
        Time.setText("");
    }

    public void viewPressed(View v) {
        Intent i = new Intent(this, TaskList.class);
        startActivity(i);
    }


}
