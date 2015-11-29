package com.example.danya.xogame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class XOActivity extends AppCompatActivity {

    public int flag = 1 ; // 1->x & 0 -> o
    public Button mButton1 ;
    public Button mButton2 ;
    public Button mButton3 ;
    public Button mButton4 ;
    public Button mButton5 ;
    public Button mButton6 ;
    public Button mButton7 ;
    public Button mButton8 ;
    public Button mButton9;
    public String  s1 , s2, s3, s4, s5, s6, s7, s8, s9 ;



    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xo);

        //******************************************************************************************

        mButton1 = (Button)findViewById(R.id.button);
        mButton2 = (Button)findViewById(R.id.button2);
        mButton3 = (Button)findViewById(R.id.button3);
        mButton4 = (Button)findViewById(R.id.button4);
        mButton5 = (Button)findViewById(R.id.button5);
        mButton6 = (Button)findViewById(R.id.button6);
        mButton7 = (Button)findViewById(R.id.button7);
        mButton8 = (Button)findViewById(R.id.button8);
        mButton9 = (Button)findViewById(R.id.button9);

        //******************************************************************************************
        //******************************************************************************************

        mButton1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                s1 = mButton1.toString();
                s2 = mButton2.toString();
                s3 = mButton3.toString();
                s4 = mButton4.toString();
                s5 = mButton5.toString();
                s7 = mButton7.toString();
                s9 = mButton9.toString();

                if (flag == 1) {
                    mButton1.setText("X");
                    flag = 0;
                } else {
                    mButton1.setText("O");
                    flag = 1;

                }

                if ( s1 == s2 && s2 == s3 )
                {
                    if (s1 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s1 == s4 && s4 == s7 )
                {
                    if (s1 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s1 == s5 && s5 == s9 )
                {
                    if (s2 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }





            }
        });

        //******************************************************************************************


        mButton2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                s1 = mButton1.toString();
                s2 = mButton2.toString();
                s3 = mButton3.toString();
                s5 = mButton5.toString();
                s8 = mButton8.toString();


                if ( flag == 1) {
                    mButton2.setText("X");
                    flag = 0;
                }

                else
                {
                    mButton2.setText("O");
                    flag = 1 ;

                }

                if ( s1 == s2 && s2 == s3 )
                {
                    if (s1 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s2 == s5 && s5 == s8 )
                {
                    if (s2 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }


            }
        });

        //******************************************************************************************

        mButton3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                s1 = mButton1.toString();
                s2 = mButton2.toString();
                s3 = mButton3.toString();
                s5 = mButton5.toString();
                s6 = mButton6.toString();
                s7 = mButton7.toString();
                s9 = mButton9.toString();

                if ( flag == 1) {
                    mButton3.setText("X");
                    flag = 0;
                }

                else
                {
                    mButton3.setText("O");
                    flag = 1 ;

                }

                if ( s1 == s2 && s2 == s3 )
                {
                    if (s1 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s3 == s6 && s6 == s9 )
                {
                    if (s3 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s3 == s5 && s5 == s7 )
                {
                    if (s3 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }


            }
        });

        //******************************************************************************************

        mButton4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                s1 = mButton1.toString();
                s4 = mButton4.toString();
                s5 = mButton5.toString();
                s6 = mButton6.toString();
                s7 = mButton7.toString();


                if ( flag == 1) {
                    mButton4.setText("X");
                    flag = 0;
                }

                else
                {
                    mButton4.setText("O");
                    flag = 1 ;

                }

                if ( s4 == s5 && s5 == s6 )
                {
                    if (s4 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s1 == s4 && s4 == s7 )
                {
                    if (s1 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        //******************************************************************************************

        mButton5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){



                s1 = mButton1.toString();
                s2 = mButton2.toString();
                s3 = mButton3.toString();

                s4 = mButton4.toString();
                s5 = mButton5.toString();
                s6 = mButton6.toString();

                s7 = mButton7.toString();
                s8 = mButton8.toString();
                s9 = mButton9.toString();

                if ( flag == 1) {
                    mButton5.setText("X");
                    flag = 0;
                }

                else
                {
                    mButton5.setText("O");
                    flag = 1 ;

                }

                if ( s4 == s5 && s5 == s6 )
                {
                    if (s4 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s2 == s5 && s5 == s8 )
                {
                    if (s2 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s1 == s5 && s5 == s9 )
                {
                    if (s2 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s3 == s5 && s5 == s7 )
                {
                    if (s3 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        //******************************************************************************************

        mButton6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                s3 = mButton3.toString();
                s4 = mButton4.toString();
                s5 = mButton5.toString();
                s6 = mButton6.toString();
                s9 = mButton9.toString();

                if ( flag == 1) {
                    mButton6.setText("X");
                    flag = 0;
                }

                else
                {
                    mButton6.setText("O");
                    flag = 1 ;

                }

                if ( s4 == s5 && s5 == s6 )
                {
                    if (s4 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }


                if ( s3 == s6 && s6 == s9 )
                {
                    if (s3 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

            }

        });

        //******************************************************************************************

        mButton7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                s1 = mButton1.toString();

                s3 = mButton3.toString();

                s4 = mButton4.toString();
                s5 = mButton5.toString();

                s7 = mButton7.toString();
                s8 = mButton8.toString();
                s9 = mButton9.toString();

                if ( flag == 1) {
                    mButton7.setText("X");
                    flag = 0;
                }

                else
                {
                    mButton7.setText("O");
                    flag = 1 ;

                }

                if ( s7 == s8 && s8 == s9 )
                {
                    if (s8 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s1 == s4 && s4 == s7 )
                {
                    if (s1 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s3 == s5 && s5 == s7 )
                {
                    if (s3 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        //******************************************************************************************

        mButton8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                s2 = mButton2.toString();
                s5 = mButton5.toString();
                s7 = mButton7.toString();
                s8 = mButton8.toString();
                s9 = mButton9.toString();

                if ( flag == 1) {
                    mButton8.setText("X");
                    flag = 0;
                }

                else
                {
                    mButton8.setText("O");
                    flag = 1 ;

                }

                if ( s7 == s8 && s8 == s9 )
                {
                    if (s8 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s2 == s5 && s5 == s8 )
                {
                    if (s2 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        //******************************************************************************************

        mButton9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                s1 = mButton1.toString();
                s2 = mButton2.toString();
                s3 = mButton3.toString();

                s5 = mButton5.toString();
                s6 = mButton6.toString();

                s7 = mButton7.toString();
                s8 = mButton8.toString();
                s9 = mButton9.toString();



                if ( flag == 1) {
                    mButton9.setText("X");
                    flag = 0;
                }

                else
                {
                    mButton9.setText("O");
                    flag = 1 ;

                }

                if ( s7 == s8 && s8 == s9 )
                {
                    if (s8 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s3 == s6 && s6 == s9 )
                {
                    if (s3 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }

                if ( s1 == s5 && s5 == s9 )
                {
                    if (s2 == "X")
                    {
                        Toast.makeText(XOActivity.this, R.string.player1_toast, Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(XOActivity.this, R.string.player2_toast, Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        //******************************************************************************************
        //******************************************************************************************

    }
}
