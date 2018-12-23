package com.example.xxaemaethxx.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView Title;
    private Button Signup;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title = (TextView) findViewById(R.id.tvSub);
        Signup = (Button) findViewById(R.id.btnSignup);
        Login = (Button) findViewById(R.id.btnLogin);


        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Toast.makeText(getApplicationContext(),"blah motherfucker", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"Signing you up...", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, Signup.class);
                startActivity(i);
            }
        });


    }
}
