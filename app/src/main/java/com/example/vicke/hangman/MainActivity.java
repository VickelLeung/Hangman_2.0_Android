package com.example.vicke.hangman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay;
    private Button btnHowTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button) findViewById(R.id.btn_play);
        btnHowTo = (Button) findViewById(R.id.btn_howTo);

        //link play btn to opponent activity
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //create an intent to link to play
                Intent intent = new Intent(MainActivity.this, opponentActivity.class);
                //start the activity
                startActivity(intent);

            }
        });



    }
}
