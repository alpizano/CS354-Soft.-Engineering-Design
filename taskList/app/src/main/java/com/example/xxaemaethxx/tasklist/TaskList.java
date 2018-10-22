package com.example.xxaemaethxx.tasklist;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TaskList extends AppCompatActivity {

    Courses courseObject = new Courses();
    DatabaseHelper helper = new DatabaseHelper(this);

    private ListView courseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        courseView = findViewById(R.id.listView) ;
        fillListView();
    }

    private void fillListView() {

        Cursor cursor = helper.getCourses();
        //ArrayList<String> courseList = new ArrayList<>();
        ArrayList<Courses> courseList = new ArrayList<>();
        String result = "";

        while(cursor.moveToNext()) {
            // get the value from the database in column 1 & and add to ArrayList
            result = cursor.getString(1) + " " + cursor.getString(2) + " " + cursor.getString(3);
            courseList.add(result);
        }

        //iterate thru array list and getName getDate getTime
        
        // Create ArrayAdapter and adapt ArrayList to Adapter
        ArrayAdapter<Courses> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, courseList);
        courseView.setAdapter(arrayAdapter);

        courseView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Should return object
                String name = adapterView.getItemAtPosition(i).toString();
                String[] words = name.split(" ");
               String courseName = words[0];
                String date = words[1];
               String time = words[2];

                // attempting to return Course object and pull name, time and date variables- not working
                //Courses courseObject = (Courses) adapterView.getItemAtPosition(i);
                //String name = courseObject.getName();
                //String date = courseObject.getDate();
               // String time = courseObject.getTime();

               // String name = (EditText) view.findViewById(R.id.etName).getText().toString();

                //course.getDate().toString();
                //String date = adapterView.getItemAtPosition(i).toString();
                //String time = adapterView.getItemAtPosition(i).toString();

                Log.d("TaskList", "onItemClick: You clicked on " + name);

                Cursor data = helper.getItemID(courseName); // get ID associated with name
                int itemID = -1;
                while(data.moveToNext()) {
                    itemID = data.getInt(0);
                }
                if(itemID > -1) {
                    Log.d("TaskList", "onItemClick: You clicked on " + name);
                    Intent intent = new Intent(TaskList.this, EditTasks.class);
                    //intent.putExtra("id",itemID);
                    intent.putExtra("name",courseName);
                    intent.putExtra("date",date);
                    intent.putExtra("time",time);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(TaskList.this, "No ID associated with that name!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
