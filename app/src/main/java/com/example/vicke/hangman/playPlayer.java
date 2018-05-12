package com.example.vicke.hangman;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class playPlayer extends AppCompatActivity {

    private Button btnMenu, btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI,
            btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV,
            btnW, btnX, btnY, btnZ, btnSubmit, btnRestart;

    private TextView tv, countDown;
    private ImageView hangImg;
    private EditText etGuess;

    private String mysteryWord, hiddenWord;
    private int remainingTurn, won;
    private String userWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_player);

        userWord = ChooseWord.getWord();

        //link button
        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);
        btnF = (Button) findViewById(R.id.btnF);
        btnG = (Button) findViewById(R.id.btnG);
        btnH = (Button) findViewById(R.id.btnH);
        btnI = (Button) findViewById(R.id.btnI);
        btnJ = (Button) findViewById(R.id.btnJ);
        btnK = (Button) findViewById(R.id.btnK);
        btnL = (Button) findViewById(R.id.btnL);
        btnM = (Button) findViewById(R.id.btnM);
        btnN = (Button) findViewById(R.id.btnN);
        btnO = (Button) findViewById(R.id.btnO);
        btnP = (Button) findViewById(R.id.btnP);
        btnQ = (Button) findViewById(R.id.btnQ);
        btnR = (Button) findViewById(R.id.btnR);
        btnS = (Button) findViewById(R.id.btnS);
        btnT = (Button) findViewById(R.id.btnT);
        btnU = (Button) findViewById(R.id.btnU);
        btnV = (Button) findViewById(R.id.btnV);
        btnW = (Button) findViewById(R.id.btnW);
        btnX = (Button) findViewById(R.id.btnX);
        btnY = (Button) findViewById(R.id.btnY);
        btnZ = (Button) findViewById(R.id.btnZ);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnMenu = (Button) findViewById(R.id.btn_menu);
        btnRestart = (Button) findViewById(R.id.btnRestart);

        tv = (TextView) findViewById(R.id.mysteryWord);
        countDown = (TextView) findViewById(R.id.countdown);
        etGuess = (EditText) findViewById(R.id.userGuess);

        hangImg = (ImageView) findViewById(R.id.hangImg);

        remainingTurn = 7;

        setWord();

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               runGame('a', btnA);

            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               runGame('b', btnB);
//                btnB.setText(etGuess.getText().toString());

            }

        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               runGame('c', btnC);
            }
        });


        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('d', btnD);
//                btnD.setText(convertWord);

            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               runGame('e', btnE);
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               runGame('f', btnF);
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('g', btnG);
            }
        });

        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('h', btnH);
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('i', btnI);
            }
        });

        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('j', btnJ);
            }
        });

        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('k', btnK);
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('f', btnF);
            }
        });

        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('l', btnL);
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('M', btnM);
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('f', btnN);
            }
        });

        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('o', btnO);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('p', btnP);
            }
        });

        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('q', btnQ);
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('r', btnR);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('s', btnS);
            }
        });

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('t', btnT);
            }
        });

        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('u', btnU);
            }
        });

        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('v', btnV);
            }
        });

        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('w', btnW);

            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('x', btnX);
            }
        });

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('y', btnY);
            }
        });

        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runGame('z', btnZ);
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //go back to ask user to choose another word
                Intent intent = new Intent(playPlayer.this, ChooseWord.class );
                startActivity(intent);
            }
        });


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(won == 0 && remainingTurn > 0) {
                    String userChoice = etGuess.getText().toString();
                    userChoice = userChoice.toLowerCase();
                    if (userChoice.equals(mysteryWord)) {
                       displayMsg("Congratulation you saved him from death!");
                        won = 1;
                    } else {
                        remainingTurn--;
                        drawMen(remainingTurn);
                    }
                    checkWin();
                }
                updateTries();
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(playPlayer.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    //set the word
    public void setWord() {

        //set the mystery word
        hiddenWord = "";
        mysteryWord = userWord;
        int lengthWord = mysteryWord.length();

        for (int i = 0; i < lengthWord; i++) {

            if(mysteryWord.charAt(i) == ' ') {
                hiddenWord += " ";
            }
            else {
                hiddenWord += "?";
            }
        }
        tv.setText(hiddenWord);
    }

    public void drawMen(int x){

        switch(x){
            case 0:hangImg.setImageResource(R.drawable.deadman);
                break;
            case 1:hangImg.setImageResource(R.drawable.hangman6);
                break;
            case 2:hangImg.setImageResource(R.drawable.hangman5);
                break;
            case 3:hangImg.setImageResource(R.drawable.hangman4);
                break;
            case 4:hangImg.setImageResource(R.drawable.hangman3);
                break;
            case 5:hangImg.setImageResource(R.drawable.hangman2);
                break;
            case 6:hangImg.setImageResource(R.drawable.hangman1);
                break;
        }
    }

     public void checkWord(char character){

        String temp = "";

        temp = hiddenWord;

        boolean replaced = false;

        for(int i = 0; i<mysteryWord.length(); i++){

            if(character == mysteryWord.charAt(i)){

                temp = temp.substring(0,i) + character + temp.substring(i+1);
                replaced = true;
            }
        }

         hiddenWord = temp;

         if(replaced)
             tv.setText(temp);
         else {
             remainingTurn--;
             drawMen(remainingTurn);
         }

         updateTries();
     }

    public boolean checkWin(){
        if(hiddenWord.equals(mysteryWord)) {
            won = 1;
            displayMsg("Congratulation! He is saved for now.");
            return true;
        }
        else
            return false;
    }

    public boolean checkDead(){

        if(remainingTurn == 0) {
            displayMsg("Oh no you killed him, shame on you!\nThe mystery Word was < " + mysteryWord+" >");
            return true;
        }
        else
            return false;
    }

    public void updateTries(){
        countDown.setText(String.valueOf(remainingTurn));
    }

    public void runGame(char x, Button btn){

        if(won == 0) {
            if (!checkDead()) {
                checkWord(x);
                btn.setVisibility(View.INVISIBLE);
            } else
                checkDead();

            checkWin();
        }
    }

    public void displayMsg(String title){
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        builder.setTitle(title)
                .setMessage("Would you like to play again?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //go back to ask user to choose another word
                        Intent intent = new Intent(playPlayer.this, ChooseWord.class );
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                       finish();
                       moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(0);
                    }
                })
//                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

}