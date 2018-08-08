package com.example.android.p2footballscorekeeper_normacmartinez;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;

    MediaPlayer goal;
    MediaPlayer corneta;
    Button btnHappy2;
    Button btnHappy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         /* Show the scores,fouls and cards when the device is rotated. */
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            foulTeamA = savedInstanceState.getInt("foulTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
            foulTeamB = savedInstanceState.getInt("foulTeamB");
            yellowCardTeamA = savedInstanceState.getInt("yellowCardTeamA");
            redCardTeamA = savedInstanceState.getInt("redCardTeamA");
            yellowCardTeamB = savedInstanceState.getInt("yellowCardTeamB");
            redCardTeamB = savedInstanceState.getInt("redCardTeamB");
            displayForTeamA(scoreTeamA);
            displayForFoulTeamA(foulTeamA);
            displayForTeamB(scoreTeamB);
            displayForFoulTeamB(foulTeamB);
            displayYellowCardForTeamA(yellowCardTeamA);
            displayRedCardForTeamA(redCardTeamA);
            displayRedCardForTeamB(redCardTeamB);
            displayYellowCardForTeamB(yellowCardTeamB);
        }


    }

    /**
     * Saves the scores,fouls and cards when the device is rotated.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("scoreTeamA", scoreTeamA);
        savedInstanceState.putInt("foulTeamA", foulTeamA);
        savedInstanceState.putInt("scoreTeamB", scoreTeamB);
        savedInstanceState.putInt("foulTeamB", foulTeamB);
        savedInstanceState.putInt("yellowCardTeamA", yellowCardTeamA);
        savedInstanceState.putInt("redCardTeamA", redCardTeamA);
        savedInstanceState.putInt("yellowCardTeamB", yellowCardTeamB);
        savedInstanceState.putInt("redCardTeamB", redCardTeamB);

    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the foul for Team A by 1 point.
     */
    public void addOneForFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayForFoulTeamA(foulTeamA);
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayForFoulTeamA(int foulTeamA) {
        TextView foulView = findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foulTeamA));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the foul for Team B by 1 point.
     */
    public void addOneForFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayForFoulTeamB(foulTeamB);
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayForFoulTeamB(int foulTeamB) {
        TextView foulView = findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foulTeamB));
    }



    /**
     * Increase the yellow card for Team A by 1 point.
     */
    public void addOneYellowCardForTeamA(View v) {
        yellowCardTeamA  = yellowCardTeamA + 1;

        displayYellowCardForTeamA(yellowCardTeamA);
    }

    /**
     * Displays the yellow card  for Team A.
     */
    public void displayYellowCardForTeamA (int yellowCardTeamA) {
        TextView cardView = findViewById(R.id.yellow_card_team_a);
        cardView.setText(String.valueOf(yellowCardTeamA));
    }

    /**
     * Increase the red card for Team A by 1 point.
     */
    public void addOneRedCardForTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;

        displayRedCardForTeamA(redCardTeamA);
    }

    /**
     * Displays the red card  for Team A.
     */
    public void displayRedCardForTeamA (int redCardTeamA) {
        TextView cardView = findViewById(R.id.red_card_team_a);
        cardView.setText(String.valueOf(redCardTeamA));
    }

    /**
     * Increase the yellow card for Team B by 1 point.
     */
    public void addOneYellowCardForTeamB(View v) {
        yellowCardTeamB  = yellowCardTeamB + 1;

        displayYellowCardForTeamB(yellowCardTeamB);
    }

    /**
     * Displays the yellow card  for Team B.
     */
    public void displayYellowCardForTeamB (int yellowCardTeamB) {
        TextView cardView = findViewById(R.id.yellow_card_team_b);
        cardView.setText(String.valueOf(yellowCardTeamB));
    }

    /**
     * Increase the red card for Team B by 1 point.
     */
    public void addOneRedCardForTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;

        displayRedCardForTeamB(redCardTeamB);
    }


    /**
     * Displays the red card  for Team B.
     */
    public void displayRedCardForTeamB (int redCardTeamB) {
        TextView cardView = findViewById(R.id.red_card_team_b);
        cardView.setText(String.valueOf(redCardTeamB));
    }

    /**
     *
     * Reset the scores for both teams back to 0
     */

    public void resetScore(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        foulTeamA = 0;
        displayForFoulTeamA(foulTeamA);
        foulTeamB = 0;
        displayForFoulTeamB(foulTeamB);
        yellowCardTeamA = 0;
        displayYellowCardForTeamA(yellowCardTeamA);
        redCardTeamA = 0;
        displayRedCardForTeamA(redCardTeamA);
        yellowCardTeamB = 0;
        displayYellowCardForTeamB(yellowCardTeamB);
        redCardTeamB = 0;
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * This method is called when the happy buttons are clicked.
     */


    public void goal(View view) {
        btnHappy = (Button)findViewById(R.id.btnHappy);
        goal = MediaPlayer.create(this,R.raw.gol);
        btnHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goal.start();
            }
        });

    }


    public void corneta(View view) {
        btnHappy2 = (Button)findViewById(R.id.btnhappy2);
        corneta = MediaPlayer.create(this,R.raw.corneta);
        btnHappy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                corneta.start();
            }
        });

    }
}
