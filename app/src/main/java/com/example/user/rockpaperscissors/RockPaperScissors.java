package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageButton;
import android.graphics.Color;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissors extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Game game;
    TextView welcomeText;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("RockPaperScissors", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeText = (TextView) findViewById(R.id.welcome_text);
        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
        resultText = (TextView) findViewById(R.id.result);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game = new Game();
                String result = game.getWinner("rock");
                resultText.setText(result);
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game = new Game();
                String result = game.getWinner("paper");
                resultText.setText(result);
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game = new Game();
                String result = game.getWinner("scissors");
                resultText.setText(result);
            }
        });

    }
}