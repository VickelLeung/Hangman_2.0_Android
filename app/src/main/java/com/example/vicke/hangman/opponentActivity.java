package com.example.vicke.hangman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class opponentActivity extends AppCompatActivity {

    private Button btnComputer, btnMenu, btnHuman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opponent);

        btnComputer = (Button) findViewById(R.id.btn_comp);
        btnHuman = (Button) findViewById(R.id.btn_human);
        btnMenu = (Button) findViewById(R.id.btn_menu);

        btnComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opponentActivity.this, playComputer.class);

                startActivity(intent);

            }
        });

        btnHuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opponentActivity.this, ChooseWord.class);
                startActivity(intent);

            }
        });


        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opponentActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }






}
