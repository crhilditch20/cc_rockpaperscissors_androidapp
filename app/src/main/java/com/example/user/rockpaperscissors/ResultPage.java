package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class ResultPage extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("RockPaperScissors", "result page called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = (TextView) findViewById(R.id.result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("score");
        resultText.setText(result);

    }
}
