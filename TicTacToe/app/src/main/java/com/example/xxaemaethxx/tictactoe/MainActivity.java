package com.example.xxaemaethxx.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r = new Random();


    //int max = 9;
    //int min = 1;
    //int q = r.nextInt(max - min + 1) + min;

    final static String TAG = " ";

    String[][] boxes = new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}} ;
    static String mark = "X" ;
    static boolean winFlag = false ;
    static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fillBox(View view){
        int x = r.nextInt(3);
        int y = r.nextInt(3);

        int id = view.getId() ;
        Log.i("ADebugTag", "Value of view.getId(): " + String.valueOf(view.getId()));
        switch (id){
            case R.id.button1:
                //generates random int number from 0 to 2
                //int x = r.nextInt(3);
                //int y = r.nextInt(3);

                Log.i("ADebugTag", "Value of x: " + String.valueOf(x));
                Log.d("ADebugTag", "Value of y: " + String.valueOf(y));

                if(winFlag == true)
                    break;

                // if first box is empty, mark an X
                if(boxes[0][0].length() == 0)
                {
                    boxes[0][0] = mark;
                    Button btn = findViewById(R.id.button1) ;
                    btn.setText(mark);

                }
                counter++ ;
                Log.i("ADebugTag", "Counter value after user turn: " + String.valueOf(counter));

                // if greater than or equal to 5 turns, check for winner
                if(counter >= 5)
                    checkWinner(0, 0);

                if(mark.equals("X"))
                    mark = "O" ;

                else
                    mark = "X";

        //if(boxes[0][0].length() != 0 && )
                    // marks random index with "O"
                    if (boxes[x][y].length() == 0)
                    {
                        boxes[x][y] = mark;
                        whichButton(x, y);
                        counter++;
                        Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                        if (counter >= 6)
                            checkWinner(x, y);
                    }
                    else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                            || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                        {
                        int newX = r.nextInt(3);
                        int newY = r.nextInt(3);

                        Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                        Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                        while (boxes[newX][newY].length() != 0) {
                            newX = r.nextInt(3);
                            newY = r.nextInt(3);
                        }
                        Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                        Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                        boxes[newX][newY] = mark;
                        whichButton(newX, newY);
                        counter++;
                        Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                        if (counter >= 6)
                            checkWinner(newX, newY);
                    }

                    if (mark.equals("X"))
                        mark = "O";
                    else
                        mark = "X";

                break ;

            case R.id.button2:

                Log.i("ADebugTag", "Value of x: " + String.valueOf(x));
                Log.d("ADebugTag", "Value of y: " + String.valueOf(y));

                if(winFlag == true)
                    break ;

                Log.i("MainActivity","Button 2 is pressed!") ;

                if(boxes[0][1].length() == 0) {
                    boxes[0][1] = mark;
                    Button btn = findViewById(R.id.button2) ;
                    btn.setText(mark);
                }
                counter++ ;
                if(counter >= 5)
                    checkWinner(0, 1);

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;


                    // marks random index with "O"
                    if (boxes[x][y].length() == 0)
                    {
                        boxes[x][y] = mark;
                        whichButton(x, y);
                        counter++;
                        Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                        if (counter >= 6)
                            checkWinner(x, y);
                    }
                    else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                            || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                        {
                        int newX = r.nextInt(3);
                        int newY = r.nextInt(3);

                        Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                        Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                        while (boxes[newX][newY].length() != 0) {
                            newX = r.nextInt(3);
                            newY = r.nextInt(3);
                        }
                        Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                        Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                        boxes[newX][newY] = mark;
                        whichButton(newX, newY);
                        counter++;
                        Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                        if (counter >= 6)
                            checkWinner(newX, newY);
                    }
                    if (mark.equals("X"))
                        mark = "O";
                    else
                        mark = "X";
                break;

            case R.id.button3:

                Log.i("ADebugTag", "Value of x: " + String.valueOf(x));
                Log.d("ADebugTag", "Value of y: " + String.valueOf(y));

                if(winFlag == true)
                    break ;

                Log.i("MainActivity","Button 3 is pressed!") ;

                if(boxes[0][2].length() == 0) {
                    boxes[0][2] = mark;
                    Button btn = findViewById(R.id.button3) ;
                    btn.setText(mark);
                }
                counter++;

                if(counter >= 5)
                    checkWinner(0, 2);

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;

                    // marks random index with "O"
                    if (boxes[x][y].length() == 0) {
                        boxes[x][y] = mark;
                        whichButton(x, y);
                        counter++;
                        Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                        if(counter >= 6)
                            checkWinner(x, y);
                    }
                    else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                            || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                        {
                        int newX = r.nextInt(3);
                        int newY = r.nextInt(3);

                        Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                        Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                        while (boxes[newX][newY].length() != 0) {
                            newX = r.nextInt(3);
                            newY = r.nextInt(3);
                        }
                        Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                        Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                        boxes[newX][newY] = mark;
                        whichButton(newX, newY);
                        counter++;
                        Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                            if(counter >= 6)
                                checkWinner(newX, newY);
                    }


                    if (mark.equals("X"))
                        mark = "O";
                    else
                        mark = "X";


                break;

            case R.id.button4:
                if(winFlag == true)
                    break ;
                if(boxes[1][0].length() == 0) {
                    boxes[1][0] = mark;
                    Button btn = findViewById(R.id.button4) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5)
                    checkWinner(1, 0);

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;

                // marks random index with "O"
                if (boxes[x][y].length() == 0) {
                    boxes[x][y] = mark;
                    whichButton(x, y);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(x, y);
                }
                else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                        || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                {
                    int newX = r.nextInt(3);
                    int newY = r.nextInt(3);

                    Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                    while (boxes[newX][newY].length() != 0) {
                        newX = r.nextInt(3);
                        newY = r.nextInt(3);
                    }
                    Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                    boxes[newX][newY] = mark;
                    whichButton(newX, newY);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(newX, newY);
                }

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;
                break ;

            case R.id.button5:
                if(winFlag == true)
                    break ;
                if(boxes[1][1].length() == 0) {
                    boxes[1][1] = mark;
                    Button btn = findViewById(R.id.button5) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5)
                    checkWinner(1, 1);

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;

                // marks random index with "O"
                if (boxes[x][y].length() == 0) {
                    boxes[x][y] = mark;
                    whichButton(x, y);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(x, y);
                }
                else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                        || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                {
                    int newX = r.nextInt(3);
                    int newY = r.nextInt(3);

                    Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                    while (boxes[newX][newY].length() != 0) {
                        newX = r.nextInt(3);
                        newY = r.nextInt(3);
                    }
                    Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                    boxes[newX][newY] = mark;
                    whichButton(newX, newY);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(newX, newY);
                }
                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;
                break;

            case R.id.button6:
                if(winFlag == true) break ;
                if(boxes[1][2].length() == 0) {
                    boxes[1][2] = mark;
                    Button btn = findViewById(R.id.button6) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5)
                    checkWinner(1, 2);

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;

                // marks random index with "O"
                if (boxes[x][y].length() == 0) {
                    boxes[x][y] = mark;
                    whichButton(x, y);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(x, y);
                }
                else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                        || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                {
                    int newX = r.nextInt(3);
                    int newY = r.nextInt(3);

                    Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                    while (boxes[newX][newY].length() != 0) {
                        newX = r.nextInt(3);
                        newY = r.nextInt(3);
                    }
                    Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                    boxes[newX][newY] = mark;
                    whichButton(newX, newY);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(newX, newY);
                }

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;
                break;

            case R.id.button7:
                if(winFlag == true)
                    break ;
                if(boxes[2][0].length() == 0) {
                    boxes[2][0] = mark;
                    Button btn = findViewById(R.id.button7) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5)
                    checkWinner(2, 0);

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;

                // marks random index with "O"
                if (boxes[x][y].length() == 0) {
                    boxes[x][y] = mark;
                    whichButton(x, y);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(x, y);
                }
                else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                        || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                {
                    int newX = r.nextInt(3);
                    int newY = r.nextInt(3);

                    Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                    while (boxes[newX][newY].length() != 0) {
                        newX = r.nextInt(3);
                        newY = r.nextInt(3);
                    }
                    Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                    boxes[newX][newY] = mark;
                    whichButton(newX, newY);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(newX, newY);
                }


                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;
                break;

            case R.id.button8:
                if(winFlag == true)
                    break ;
                if(boxes[2][1].length() == 0) {
                    boxes[2][1] = mark;
                    Button btn = findViewById(R.id.button8) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5)
                    checkWinner(2, 1);

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;


                // marks random index with "O"
                if (boxes[x][y].length() == 0) {
                    boxes[x][y] = mark;
                    whichButton(x, y);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(x, y);
                }
                else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                        || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                {
                    int newX = r.nextInt(3);
                    int newY = r.nextInt(3);

                    Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                    while (boxes[newX][newY].length() != 0) {
                        newX = r.nextInt(3);
                        newY = r.nextInt(3);
                    }
                    Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                    boxes[newX][newY] = mark;
                    whichButton(newX, newY);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(newX, newY);
                }

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;
                break;

            case R.id.button9:
                if(winFlag == true) break ;
                if(boxes[2][2].length() == 0) {
                    boxes[2][2] = mark;
                    Button btn = findViewById(R.id.button9) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5)
                    checkWinner(2, 2);

                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;

                // marks random index with "O"
                if (boxes[x][y].length() == 0) {
                    boxes[x][y] = mark;
                    whichButton(x, y);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. 1st sucess. attempt: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(x, y);
                }
                else if((boxes[x][y].length() != 0) && (boxes[0][0].length() == 0 || boxes[0][1].length() == 0 || boxes[0][2].length() == 0 || boxes[1][0].length() == 0 || boxes[1][1].length() == 0
                        || boxes[1][2].length() == 0 || boxes[2][0].length() == 0 || boxes[2][1].length() == 0 || boxes[2][2].length() == 0))
                {
                    int newX = r.nextInt(3);
                    int newY = r.nextInt(3);

                    Log.i("ADebugTag", "Value of newX: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY: " + String.valueOf(newY));

                    while (boxes[newX][newY].length() != 0) {
                        newX = r.nextInt(3);
                        newY = r.nextInt(3);
                    }
                    Log.i("ADebugTag", "Value of newX if changed after While loop: " + String.valueOf(newX));
                    Log.d("ADebugTag", "Value of newY if changed after While loop: " + String.valueOf(newY));
                    boxes[newX][newY] = mark;
                    whichButton(newX, newY);
                    counter++;
                    Log.i("ADebugTag", "Counter value after A.I. generates new random # because boxes were full: " + String.valueOf(counter));
                    if (counter >= 6)
                        checkWinner(newX, newY);
                }
                if(mark.equals("X"))
                    mark = "O" ;
                else
                    mark = "X" ;
                break;
        }
    }

    // method to check which matrix indices correspond to which button
    public void whichButton(int i, int j) {
        if(boxes[i][j].equals(boxes[0][0])){
            Button btn1 = findViewById(R.id.button1);
            btn1.setText("O");
        }
        if(boxes[i][j].equals(boxes[0][1])){
            Button btn2 = findViewById(R.id.button2);
            btn2.setText("O");
        }
        if(boxes[i][j].equals(boxes[0][2])){
            Button btn3 = findViewById(R.id.button3);
            btn3.setText("O");
        }

        if(boxes[i][j].equals(boxes[1][0])){
            Button btn4 = findViewById(R.id.button4);
            btn4.setText("O");
        }
        if(boxes[i][j].equals(boxes[1][1])){
            Button btn5 = findViewById(R.id.button5);
            btn5.setText("O");
        }
        if(boxes[i][j].equals(boxes[1][2])){
            Button btn6 = findViewById(R.id.button6);
            btn6.setText("O");
        }

        if(boxes[i][j].equals(boxes[2][0])){
            Button btn7 = findViewById(R.id.button7);
            btn7.setText("O");
        }
        if(boxes[i][j].equals(boxes[2][1])){
            Button btn8 = findViewById(R.id.button8);
            btn8.setText("O");
        }
        if(boxes[i][j].equals(boxes[2][2])){
            Button btn9 = findViewById(R.id.button9);
            btn9.setText("O");
        }
    }

    private void checkWinner(int i, int j){
        // row 1 left-to-right victory
        if(boxes[i][0].equals(boxes[i][1]) && boxes[i][1].equals(boxes[i][2])){
            winFlag = true ;
            TextView textView = findViewById(R.id.textView) ;
            textView.setVisibility(View.VISIBLE);
            textView.setText("Winner is "+ mark);
        }
        // row 1 col 3 downto victory
        if(boxes[0][j].equals(boxes[1][j]) && boxes[0][j].equals(boxes[2][j])){
            winFlag = true ;
            TextView textView = findViewById(R.id.textView) ;
            textView.setVisibility(View.VISIBLE);
            textView.setText("Winner is "+mark);
        }

        if((i+j == 2) ||(i+j == 0) || (i+j == 4)){
            if(boxes[0][0].equals(boxes[1][1]) && boxes[0][0].equals(boxes[2][2])){
                winFlag = true ;
                TextView textView = findViewById(R.id.textView) ;
                textView.setVisibility(View.VISIBLE);
                textView.setText("Winner is "+mark);
            }

            if(boxes[0][2].equals(boxes[1][1]) && boxes[0][2].equals(boxes[2][0])){
                winFlag = true ;
                TextView textView = findViewById(R.id.textView) ;
                textView.setVisibility(View.VISIBLE);
                textView.setText("Winner is "+mark);
            }
        }
    }

    public void reset(View view){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                boxes[i][j] = "" ;
            }
        }
        mark = "X" ;
        winFlag = false ;
        counter = 0 ;
        TextView textView = findViewById(R.id.textView) ;
        textView.setText("");
        textView.setVisibility(View.INVISIBLE);
        Button btn ;
        btn = findViewById(R.id.button1) ;
        btn.setText("");
        btn = findViewById(R.id.button2) ;
        btn.setText("");
        btn = findViewById(R.id.button3) ;
        btn.setText("");
        btn = findViewById(R.id.button4) ;
        btn.setText("");
        btn = findViewById(R.id.button5) ;
        btn.setText("");
        btn = findViewById(R.id.button6) ;
        btn.setText("");
        btn = findViewById(R.id.button7) ;
        btn.setText("");
        btn = findViewById(R.id.button8) ;
        btn.setText("");
        btn = findViewById(R.id.button9) ;
        btn.setText("");
    }
}
