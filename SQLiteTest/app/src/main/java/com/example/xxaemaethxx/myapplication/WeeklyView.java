package com.example.xxaemaethxx.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WeeklyView extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    private ListView courseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_view);

        courseView = (ListView) findViewById(R.id.courseList);
        update();

    }

    public void update() {
        // Create new String ArrayList to store course name from DB
        ArrayList<String> courseList = new ArrayList<>();
        String result = "";

        // Call DatabaseHelper method getCourse to return Courses from DB
        Cursor data = helper.getCourse();

        // using For loop
        for(data.moveToFirst(); !data.isAfterLast(); data.moveToNext()) {
            result = data.getString(1) + " " + data.getString(2) + " " + data.getString(3) + "\n";
            courseList.add(result);
        }

        /* using While loop
        while(data.moveToNext()) {
            // column 1 is actually COL_NAME

           result = data.getString(1) + " " + data.getString(2) + " " + data.getString(3) + "\n";
           courseList.add(result);
        }
        */

        // Setting ArrayAdapter to link courseList (ArrayList) to courseView (ListView)
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, courseList);
        courseView.setAdapter(arrayAdapter);

    }
}
