package com.example.xxaemaethxx.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    private TextView pushName;
    private TextView pushId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        pushName = (TextView) findViewById(R.id.tvPushName);
        pushId = (TextView) findViewById(R.id.tvId);


        Intent i  = getIntent();
        String pushedName = i.getStringExtra("pushedName");
        // need to look up how to pushInt
        String returnedIndex = i.getStringExtra("pushedIndex");

        pushName.setText("Welcome " + pushedName);
        pushId.setText("Id is: " + returnedIndex);
    }
}
