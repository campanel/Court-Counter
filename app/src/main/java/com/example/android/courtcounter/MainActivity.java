package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scopeTeamA = 0;
    int scopeTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scopeTeamA = scopeTeamA + 1;
        displayForTeamA(scopeTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scopeTeamA = scopeTeamA + 2;
        displayForTeamA(scopeTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scopeTeamA = scopeTeamA + 3;
        displayForTeamA(scopeTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

   /*TEAM B*/
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        scopeTeamB = scopeTeamB + 1;
        displayForTeamB(scopeTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scopeTeamB = scopeTeamB + 2;
        displayForTeamB(scopeTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scopeTeamB = scopeTeamB + 3;
        displayForTeamB(scopeTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * reset scores .
     */
    public void resetScores(View v) {
        scopeTeamA = 0;
        scopeTeamB = 0;

        displayForTeamA(scopeTeamA);
        displayForTeamB(scopeTeamB);

    }
}
