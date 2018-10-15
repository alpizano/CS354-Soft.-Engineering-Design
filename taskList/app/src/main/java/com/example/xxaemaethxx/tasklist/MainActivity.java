package com.example.xxaemaethxx.tasklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnViewTasks;
    Button btnNewTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewTasks = (Button) findViewById(R.id.btnViewTasks);
        btnNewTask = (Button) findViewById(R.id.btnNewTask);

    }


    public void viewTasksPressed(View v) {
        Intent i = new Intent(this, TaskList.class);
        startActivity(i);
    }
    public void newTasksPressed(View v) {
        Intent i = new Intent(this, NewTasks.class);
        startActivity(i);
    }

}

