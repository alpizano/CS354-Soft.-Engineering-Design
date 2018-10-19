package com.example.xxaemaethxx.tasklist;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TaskList extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    private ListView courseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        courseView = findViewById(R.id.listView) ;
        fillListView();

        //final ArrayList<String> arrayList = new ArrayList<String>() ;
        //arrayList.add("ECE354") ;
        //arrayList.add("ECE371") ;
        //arrayList.add("ECE251") ;

        //final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList) ;
        //courseView.setAdapter(arrayAdapter);

        /*
        courseView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Welcome to "+arrayList.get(i),Toast.LENGTH_LONG).show();
                arrayList.remove(i);
                arrayAdapter.notifyDataSetChanged();

            }
        });
        */

    }

    private void fillListView() {
        Cursor data = helper.getCourses();
        ArrayList<String> courseList = new ArrayList<>();

        while(data.moveToNext()) {
            // get the value from the database in column 1 & and add to ArrayList
            courseList.add(data.getString(1));
        }
        // Create ArrayAdapter and adapt ArrayList to Adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, courseList);
        courseView.setAdapter(arrayAdapter);

        courseView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = adapterView.getItemAtPosition(i).toString();
                Log.d("ListDataActivity", "onItemClick: You clicked on " + name);

                Cursor data = helper.getItemID(name); // get ID associated with name

                Intent intent = new Intent(TaskList.this, EditTasks.class);

                intent.putExtra("name",name);
                startActivity(intent);

            }
        });
    }

}
