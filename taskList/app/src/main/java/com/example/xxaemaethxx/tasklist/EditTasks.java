package com.example.xxaemaethxx.tasklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditTasks extends AppCompatActivity {

    private EditText Name;
    private EditText Date;
    private EditText Time;

    private Button Save;
    private Button Delete;

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tasks);

        Name = (EditText) findViewById(R.id.etName);
        Date = (EditText) findViewById(R.id.etDate);
        Time = (EditText) findViewById(R.id.etTime);

    }
}
