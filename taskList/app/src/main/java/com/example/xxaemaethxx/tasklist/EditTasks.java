package com.example.xxaemaethxx.tasklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTasks extends AppCompatActivity {

    private EditText Name;
    private EditText Date;
    private EditText Time;

    private Button Save;
    private Button Delete;

    DatabaseHelper helper = new DatabaseHelper(this);

    private String selectedName;
    private String selectedDate;
    private String selectedTime;
    private int selectedID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tasks);

        Name = (EditText) findViewById(R.id.etName);
        Date = (EditText) findViewById(R.id.etDate);
        Time = (EditText) findViewById(R.id.etTime);
        Save = (Button) findViewById(R.id.btnSave);
        Delete = (Button) findViewById(R.id.btnDel);

        //get intent extras from TaskList.java
        Intent receivedIntent = getIntent();

        //get itemID passed as extra
        selectedID = receivedIntent.getIntExtra("id", -1); //NOTE: -1 is default value

        //get the name, date and time passed as extra
        selectedName = receivedIntent.getStringExtra("name");
        selectedDate = receivedIntent.getStringExtra("date");
        selectedTime = receivedIntent.getStringExtra("time");

        //set text to show the current selected name + date + time
        Name.setText(selectedName);
        Date.setText(selectedDate);
        Time.setText(selectedTime);

        // On Click Listener for SAVE button
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newName = Name.getText().toString();
                if(!newName.equals("")){
                    helper.updateName(newName,selectedID, selectedName);
                    Intent intent = new Intent(EditTasks.this, TaskList.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(EditTasks.this, "You must enter a name!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // On Click Listener for DELETE button
        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.deleteName(selectedID,selectedName);
                Name.setText("");
                Intent intent = new Intent(EditTasks.this, TaskList.class);
                startActivity(intent);
                Toast.makeText(EditTasks.this,"User removed from database!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
