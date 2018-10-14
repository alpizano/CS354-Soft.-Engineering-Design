package com.example.xxaemaethxx.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
        int id = view.getId() ;
        switch (id){
            case R.id.button1:
                if(winFlag == true) break ;
                if(boxes[0][0].length() == 0) {
                    boxes[0][0] = mark;
                    Button btn = findViewById(R.id.button1) ;
                    btn.setText(mark);
                }
                counter++ ;
                if(counter >= 5)
                    checkWinner(0, 0);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;

                break ;
            case R.id.button2:
                if(winFlag == true) break ;
                Log.i("MainActivity","Button 2 is pressed!") ;
                if(boxes[0][1].length() == 0) {
                    boxes[0][1] = mark;
                    Button btn = findViewById(R.id.button2) ;
                    btn.setText(mark);
                }
                counter++ ;
                if(counter >= 5)
                    checkWinner(0, 1);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;
                break ;
            case R.id.button3:
                if(winFlag == true) break ;
                Log.i("MainActivity","Button 3 is pressed!") ;
                if(boxes[0][2].length() == 0) {
                    boxes[0][2] = mark;
                    Button btn = findViewById(R.id.button3) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5) checkWinner(0, 2);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;
                break ;
            case R.id.button4:
                if(winFlag == true) break ;
                if(boxes[1][0].length() == 0) {
                    boxes[1][0] = mark;
                    Button btn = findViewById(R.id.button4) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5) checkWinner(1, 0);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;
                break ;
            case R.id.button5:
                if(winFlag == true) break ;
                if(boxes[1][1].length() == 0) {
                    boxes[1][1] = mark;
                    Button btn = findViewById(R.id.button5) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5) checkWinner(1, 1);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;
                break ;
            case R.id.button6:
                if(winFlag == true) break ;
                if(boxes[1][2].length() == 0) {
                    boxes[1][2] = mark;
                    Button btn = findViewById(R.id.button6) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5) checkWinner(1, 2);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;
                break ;
            case R.id.button7:
                if(winFlag == true) break ;
                if(boxes[2][0].length() == 0) {
                    boxes[2][0] = mark;
                    Button btn = findViewById(R.id.button7) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5) checkWinner(2, 0);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;
                break ;
            case R.id.button8:
                if(winFlag == true) break ;
                if(boxes[2][1].length() == 0) {
                    boxes[2][1] = mark;
                    Button btn = findViewById(R.id.button8) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5) checkWinner(2, 1);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;
                break ;
            case R.id.button9:
                if(winFlag == true) break ;
                if(boxes[2][2].length() == 0) {
                    boxes[2][2] = mark;
                    Button btn = findViewById(R.id.button9) ;
                    btn.setText(mark);
                }
                counter++;
                if(counter >= 5) checkWinner(2, 2);
                if(mark.equals("X")) mark = "O" ;
                else mark = "X" ;
                break ;

        }
    }
    private void checkWinner(int i, int j){
        if(boxes[i][0].equals(boxes[i][1]) && boxes[i][1].equals(boxes[i][2])){
            winFlag = true ;
            TextView textView = findViewById(R.id.textView) ;
            textView.setVisibility(View.VISIBLE);
            textView.setText("Winner is "+mark);
        }
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
