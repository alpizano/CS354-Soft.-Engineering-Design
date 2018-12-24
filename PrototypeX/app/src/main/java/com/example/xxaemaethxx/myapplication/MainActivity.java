package com.example.xxaemaethxx.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView Title;
    private TextView Name;
    private EditText Username;
    private EditText PW;
    private Button Signup;
    private Button Login;
    DatabaseHelper helper = new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title = (TextView) findViewById(R.id.tvSub);
        Name = (TextView) findViewById(R.id.etName);
        Username = (EditText) findViewById(R.id.etUsername);
        PW = (EditText) findViewById(R.id.etPw) ;
        Signup = (Button) findViewById(R.id.btnSignup);
        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredName = Username.getText().toString();
                String enteredPW = PW.getText().toString();

                boolean ans = helper.checkPW(enteredName, enteredPW);
                Log.i("ADebugTag", "Value of return boolean from DB is: " + ans);

                if(ans == true) {
                    Intent i = new Intent(MainActivity.this, Splash.class);
                    i.putExtra("pushedName",enteredName);
                    startActivity(i);

                }
                else if (ans == false){
                    Toast.makeText(MainActivity.this, "WRONG PW", Toast.LENGTH_LONG).show();
                }

            }
        });


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
