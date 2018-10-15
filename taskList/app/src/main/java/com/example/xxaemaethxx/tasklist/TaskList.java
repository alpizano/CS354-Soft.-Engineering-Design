package com.example.xxaemaethxx.tasklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TaskList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        ListView listView = findViewById(R.id.listView) ;
        final ArrayList<String> arrayList = new ArrayList<String>() ;

        arrayList.add("ECE354") ;
        arrayList.add("ECE371") ;
        arrayList.add("ECE251") ;

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList) ;
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Welcome to "+arrayList.get(i),Toast.LENGTH_LONG).show();
                arrayList.remove(i);
                arrayAdapter.notifyDataSetChanged();

            }
        });


    }
}
