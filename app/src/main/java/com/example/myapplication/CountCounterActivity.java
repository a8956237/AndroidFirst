package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CountCounterActivity extends AppCompatActivity {

    private int aScore = 0;
    private int bScore = 0;
    private TextView mScoreA;
    private TextView mScoreB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //
        setContentView(R.layout.activity_count_counter);

        mScoreA = (TextView) findViewById(R.id.score_A);
        mScoreB = (TextView) findViewById(R.id.score_B);

        mScoreA.setText("" + aScore);
        mScoreB.setText("" + bScore);
    }

    public void a3ScorePlusButtonClicked(View view) {
        aScore = aScore + 3;
        mScoreA.setText("" + aScore);
    }

    public void a2ScorePlusButtonClicked(View view) {
        aScore = aScore + 2;
        mScoreA.setText("" + aScore);
    }

    public void a1ScorePlusButtonClicked(View view) {
        aScore = aScore + 1;
        mScoreA.setText("" + aScore);
    }

    public void b3ScorePlusButtonClicked(View view) {
        bScore = bScore + 3;
        mScoreB.setText("" + bScore);
    }

    public void b2ScorePlusButtonClicked(View view) {
        bScore = bScore + 2;
        mScoreB.setText("" + bScore);
    }

    public void b1ScorePlusButtonClicked(View view) {
        bScore = bScore + 1;
        mScoreB.setText("" + bScore);
    }

    public void reset(View view) {
        aScore = 0;
        mScoreA.setText("" + aScore);
        bScore = 0;
        mScoreB.setText("" + bScore);
    }
}