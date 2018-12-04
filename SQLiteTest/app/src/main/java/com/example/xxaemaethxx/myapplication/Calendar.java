package com.example.xxaemaethxx.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.util.StringTokenizer;

public class Calendar extends AppCompatActivity {


    private TextView box1; // Sunday
    private TextView box2;
    private TextView box3;
    private TextView box4;
    private TextView box5;
    private TextView box6;
    private TextView box7;
    private TextView testBox;
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        box1 = (TextView) findViewById(R.id.box1); // Sunday
        box2 = (TextView) findViewById(R.id.box2); // Monday
        box3 = (TextView) findViewById(R.id.box3); // Tuesday
        box4 = (TextView) findViewById(R.id.box4); // Wednesday
        box5 = (TextView) findViewById(R.id.box5); // Thursday
        box6 = (TextView) findViewById(R.id.box6); // Friday
        box7 = (TextView) findViewById(R.id.box7); // Saturday
        testBox = (TextView) findViewById(R.id.tvTest);


        // To update the calendar with SQLite DB data
        update();



    }


    public void update() {


    Cursor c = helper.getCourse();
    String date = "";
    String parsedYear ="";
    String parsedMonth ="";
    String parsedDay ="";


    while(c.moveToNext()) {
    date = c.getString(2);
    StringTokenizer aTokenizer = new StringTokenizer(date,"-");

    parsedYear = aTokenizer.nextToken();
    parsedMonth = aTokenizer.nextToken();
    parsedDay = aTokenizer.nextToken();

    if(parsedDay.equals("01")) {
        String course = c.getString(1);
        String time =  c.getString(3);
        String firetext = (course + " \n " + time);



        box1.setText(firetext.replace("\\\n", System.getProperty("line.separator")));

        //testBox.setText("SUP" + System.getProperty("line.separator") + "yo");
        //testBox.setText("SUP" + System.getProperty("line.separator") + "yo");
        testBox.setText(course + " \n " + time);

        //box1.setText(c.getString(1) + "\n" + c.getString(3));
    }
        if(parsedDay.equals("02")) {
            box2.setText(c.getString(1) + "\n" + c.getString(3));
        }
        if(parsedDay.equals("03")) {
            box3.setText(c.getString(1) + "\n" + c.getString(3));
        }
        if(parsedDay.equals("04")) {
            box4.setText(c.getString(1) + "\n" + c.getString(3));
        }
        if(parsedDay.equals("05")) {
            box5.setText(c.getString(1) + "\n" + c.getString(3));
        }
        if(parsedDay.equals("06")) {
            box6.setText(c.getString(1) + "\n" + c.getString(3));
        }
        if(parsedDay.equals("07")) {
            box7.setText(c.getString(1) + "\n" + c.getString(3));
        }

    }

    }

}
