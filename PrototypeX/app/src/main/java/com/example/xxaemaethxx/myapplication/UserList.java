package com.example.xxaemaethxx.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class UserList extends AppCompatActivity {

    private ListView userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);


        userList = (ListView) findViewById(R.id.lvUsers);
    }
}
