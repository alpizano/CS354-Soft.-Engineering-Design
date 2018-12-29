package com.example.xxaemaethxx.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class UserList extends AppCompatActivity {

    private ListView userView;
    ArrayList<String> userList = new ArrayList<>();
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        userView = (ListView) findViewById(R.id.lvUsers);
        update();

        // Create ArrayAdapter and adapt ArrayList to Adapter

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, userList);
        userView.setAdapter(arrayAdapter);

        userView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                long returnedIndex = adapterView.getItemIdAtPosition(i);
                Toast.makeText(UserList.this, "The index is " + returnedIndex, Toast.LENGTH_LONG).show();
            }
        });
    }


    public void update() {
        Cursor cursor = helper.getUsers();

        String result = "";

        while(cursor.moveToNext()) {
            // get the value from the database in column 1 & and add to ArrayList
            result = cursor.getString(0) + " "+ cursor.getString(1) + " " + cursor.getString(2) + " " + cursor.getString(3) + " " + cursor.getString(4) + " " + cursor.getString(5);
            // each result row is returned from DB and each row inserted into ArrayList
            userList.add(result);
        }






    }
}
