package com.example.xxaemaethxx.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText name;
    private EditText date;
    private EditText time;
    private Button add;
    private Button weeklyView;
    private Button calendar;

    DatabaseHelper helper = new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name = (EditText) findViewById(R.id.etName);
        date = (EditText) findViewById(R.id.etDate);
        time = (EditText) findViewById(R.id.etTime);

        add = (Button) findViewById(R.id.btnAdd);
        weeklyView = (Button) findViewById(R.id.btnWeeklyView);
        calendar = (Button) findViewById(R.id.btnCalendar);

        // manually write method OnClickListener vs. using Attributes onClick dropdown box
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create new Course object to store course name, date, and time
                Course course = new Course();

                String courseName = name.getText().toString();
                course.setName(courseName);
                String courseDate = date.getText().toString();
                course.setDate(courseDate);
                String courseTime = time.getText().toString();
                course.setTime(courseTime);

                helper.addCourse(course);

                name.setText("");
                date.setText("");
                time.setText("");
            }
        });

        weeklyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, WeeklyView.class);
                startActivity(i);
            }
        });

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Calendar.class);
                startActivity(i);
            }
        });

    }
}
