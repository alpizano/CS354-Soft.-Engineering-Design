package com.example.xxaemaethxx.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Stack<String> numbers = new Stack<String>();
    ArrayList<String> numsArray = new ArrayList<String>();

    private TextView Output;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private Button btnDec;
    private Button btnEquals;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Output = (TextView) findViewById(R.id.tvOutput);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDec = (Button) findViewById(R.id.btnDec);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnClear = (Button) findViewById(R.id.btnClear);
    }
/*
    public void btn0Pressed(View v) {
        Log.i("MainActivity", "button0 pressed");
    }
    public void btn1Pressed(View v) {
        Log.i("MainActivity", "button1 pressed");
    }
    public void btn2Pressed(View v) {
        Log.i("MainActivity", "button2 pressed");
    }
    public void btn3Pressed(View v) {
        Log.i("MainActivity", "button3 pressed");
    }
    public void btn4Pressed(View v) {
        Log.i("MainActivity", "button4 pressed");
    }
    public void btn5Pressed(View v) {
        Log.i("MainActivity", "button5 pressed");
    }
    public void btn6Pressed(View v) {
        Log.i("MainActivity", "button6 pressed");
    }
    public void btn7Pressed(View v) {
        Log.i("MainActivity", "button7 pressed");
    }
    public void btn8Pressed(View v) {
        Log.i("MainActivity", "button8 pressed");
    }
    public void btn9Pressed(View v) {
        Log.i("MainActivity", "button9 pressed");
    }
    */


    public void clicks(View v) {
        int clickedId = v.getId();

        if(clickedId == R.id.btn0) {
            Toast.makeText(this, "Button 0 pressed!", Toast.LENGTH_SHORT).show();
            //numbers.push("0");
            numsArray.add("0");
            update();
        }
        if(clickedId == R.id.btn1) {
            Toast.makeText(this, "Button 1 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("1");
            update();
        }
        if(clickedId == R.id.btn2) {
            Toast.makeText(this, "Button 2 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("2");
            update();
        }
        if(clickedId == R.id.btn3) {
            Toast.makeText(this, "Button 3 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("3");
            update();
        }
        if(clickedId == R.id.btn4) {
            Toast.makeText(this, "Button 4 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("4");
            update();
        }
        if(clickedId == R.id.btn5) {
            Toast.makeText(this, "Button 5 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("5");
            update();
        }
        if(clickedId == R.id.btn6) {
            Toast.makeText(this, "Button 6 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("6");
            update();
        }
        if(clickedId == R.id.btn7) {
            Toast.makeText(this, "Button 7 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("7");
            update();
        }
        if(clickedId == R.id.btn8) {
            Toast.makeText(this, "Button 8 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("8");
            update();
        }
        if(clickedId == R.id.btn9) {
            Toast.makeText(this, "Button 9 pressed!", Toast.LENGTH_SHORT).show();
            numsArray.add("9");
            update();
        }
        if(clickedId == R.id.btnAdd) {
            Toast.makeText(this, "Button + pressed!", Toast.LENGTH_SHORT).show();
        }
        if(clickedId == R.id.btnSub) {
            Toast.makeText(this, "Button - pressed!", Toast.LENGTH_SHORT).show();
        }
        if(clickedId == R.id.btnMul) {
            Toast.makeText(this, "Button * pressed!", Toast.LENGTH_SHORT).show();
        }
        if(clickedId == R.id.btnDiv) {
            Toast.makeText(this, "Button / pressed!", Toast.LENGTH_SHORT).show();
        }
        if(clickedId == R.id.btnDec) {
            Toast.makeText(this, "Button . pressed!", Toast.LENGTH_SHORT).show();
        }
        if(clickedId == R.id.btnEquals) {
            Toast.makeText(this, "Button = pressed!", Toast.LENGTH_SHORT).show();
        }

    }

    public void update() {
        /* for stack
        String strOutput = " ";

        while(!numbers.isEmpty()) {
            strOutput = numbers.pop();
        }
        Output.setText(strOutput);
        */

        for(int i=0; i < numsArray.size(); i++) {
            Output.setText(numsArray.get(i));
        }
    }


}
