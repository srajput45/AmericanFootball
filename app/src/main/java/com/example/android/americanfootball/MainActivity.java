package com.example.android.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA = 0;
    int scoreB = 0;
    public void touchDownA(View v){
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);
    }
    public void fieldGoalA(View v){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    public void extra1A(View v){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    public void extra2A(View v){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    public void safeA(View v){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void touchDownB(View v){
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);
    }
    public void fieldGoalB(View v){
        scoreB = scoreB +3;
        displayForTeamB(scoreB);
    }
    public void extra1B(View v){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    public void extra2B(View v){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    public void safeB(View v){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }


    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
}
