package com.example.xxaemaethxx.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class UserList extends AppCompatActivity {

    private ListView userView;
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);


        userView = (ListView) findViewById(R.id.lvUsers);

        update();
    }


    public void update() {
        Cursor cursor = helper.getUsers();
        ArrayList<String> userList = new ArrayList<>();
        String result = "";

        while(cursor.moveToNext()) {
            // get the value from the database in column 1 & and add to ArrayList
            result = cursor.getString(0) + " "+ cursor.getString(1) + " " + cursor.getString(2) + " " + cursor.getString(3) + " " + cursor.getString(4);
            userList.add(result);
        }

        // Create ArrayAdapter and adapt ArrayList to Adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, userList);
        userView.setAdapter(arrayAdapter);


    }
}
