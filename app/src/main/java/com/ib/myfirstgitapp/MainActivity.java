package com.ib.myfirstgitapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int scoreTeamA=0;
    private int scoreTeamB=0;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.add();
        System.err.println("Team A and Team B");
        final TextView textView= (TextView) findViewById(R.id.textview);
        final TextView textView2= (TextView) findViewById(R.id.textview2);
        final Button add1= (Button) findViewById(R.id.addButton1);


        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 1;
                textView.setText(Integer.toString(scoreTeamA));

            }
        });
        final Button add2= (Button) findViewById(R.id.addButton2);
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA +2;
                textView.setText(Integer.toString(scoreTeamA));
            }
        });
        final Button add3= (Button) findViewById(R.id.addButton3);
        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=scoreTeamA+3;
                textView.setText(Integer.toString(scoreTeamA));
            }
        });
        final Button reset= (Button) findViewById(R.id.addButton4);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=0;
                textView.setText(Integer.toString(scoreTeamA));
            }
        });




        final Button add12= (Button) findViewById(R.id.addButton12);

        add12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB=scoreTeamB+1;
                textView2.setText(Integer.toString(scoreTeamB));

            }
        });
        final Button add22= (Button) findViewById(R.id.addButton22);
        add22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB=scoreTeamB+2;
                textView2.setText(Integer.toString(scoreTeamB));
            }
        });
        final Button add32= (Button) findViewById(R.id.addButton3);
        add32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB=scoreTeamB+3;
                textView2.setText(Integer.toString(scoreTeamB));
            }
        });
        final Button reset2= (Button) findViewById(R.id.addButton42);
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB=0;
                textView2.setText(Integer.toString(scoreTeamB));
            }
        });

    }
    public void add(){
        int a=scoreTeamA+scoreTeamB;
        result.setText(a);

    }
}
