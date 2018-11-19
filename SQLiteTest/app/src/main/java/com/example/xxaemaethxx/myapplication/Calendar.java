package com.example.xxaemaethxx.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Calendar extends AppCompatActivity {

    private TextView box1; // Sunday
    private TextView box2;
    private TextView box3;
    private TextView box4;
    private TextView box5;
    private TextView box6;
    private TextView box7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        box1 = (TextView) findViewById(R.id.box1); // Sunday
        box2 = (TextView) findViewById(R.id.box2); // Monday
        box3 = (TextView) findViewById(R.id.box3); // Tuesday
        box4 = (TextView) findViewById(R.id.box4); // Wednesday
        box5 = (TextView) findViewById(R.id.box5); // Thursday
        box6 = (TextView) findViewById(R.id.box6); // Friday
        box7 = (TextView) findViewById(R.id.box7); // Saturday


        // To update the calendar with SQLite DB data
        update();



    }


    public void update() {


    }

}
