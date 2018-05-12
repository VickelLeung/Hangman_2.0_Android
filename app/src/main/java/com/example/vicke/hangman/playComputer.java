package com.example.vicke.hangman;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class playComputer extends AppCompatActivity {

    private Button btnMenu, btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI,
            btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV,
            btnW, btnX, btnY, btnZ, btnSubmit, btnRestart;

    private TextView tv, countDown;
    private ImageView hangImg;
    private EditText et;

    private String mysteryWord, hiddenWord, convertWord, trackSpace;
    private int remainingTurn, won;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_computer);

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
        et = (EditText) findViewById(R.id.userGuess);

        hangImg = (ImageView) findViewById(R.id.hangImg);

        remainingTurn = 7;

        setWord();

        countDown.setText("7");

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(!checkDead() && won == 0) {
                    checkWord('a');
                    btnA.setVisibility(View.INVISIBLE);
                }
                else
                    checkDead();

                checkWin();

            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('b');
                        btnB.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('c');
                        btnC.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('d');
                        btnD.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('e');
                        btnE.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('f');
                        btnF.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('g');
                        btnG.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('h');
                        btnH.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('i');
                        btnI.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead()) {
                        checkWord('j');
                        btnJ.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(won == 0) {
                if (!checkDead() ) {
                    checkWord('k');
                    btnK.setVisibility(View.INVISIBLE);
                } else
                    checkDead();

                checkWin();
            }
            }
        });

        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('l');
                        btnL.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('m');
                        btnM.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('n');
                        btnN.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('o');
                        btnO.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('p');
                        btnP.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('q');
                        btnQ.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('r');
                        btnR.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('s');
                        btnS.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('t');
                        btnT.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('u');
                        btnU.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('v');
                        btnV.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });

        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('w');
                        btnW.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('X');
                        btnW.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('Y');
                        btnW.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0) {
                    if (!checkDead() ) {
                        checkWord('Z');
                        btnW.setVisibility(View.INVISIBLE);
                    } else
                        checkDead();

                    checkWin();
                }
            }
        });


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(won == 0 && remainingTurn > 0) {
                    String userChoice = et.getText().toString();
                    userChoice = userChoice.toLowerCase();
                    if (userChoice.equals(mysteryWord)) {
                        Toast.makeText(getApplicationContext(), "Good job, You won this game!", Toast.LENGTH_LONG).show();
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


        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            restart();
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(playComputer.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

public String getWord(){

    Random r = new Random();
    int rand = r.nextInt(countNumberOfWord())+1;
    int counter = 0;
    String randomWord ="";

    BufferedReader reader;

    try{
        final InputStream file = getAssets().open("file.txt");
        reader = new BufferedReader(new InputStreamReader(file));
        String line = reader.readLine();
        while(line != null && counter < rand){
            Log.d("StackOverflow", line);
            line = reader.readLine();
            counter++;
            randomWord = line;
        }
    } catch(IOException ioe){
        ioe.printStackTrace();
    }

    return randomWord;
}

public void setWord() {

    //set the mystery word
   hiddenWord = convertWord = trackSpace= "";
    mysteryWord = getWord();
    int lengthWord = mysteryWord.length();

    for (int i = 0; i < lengthWord; i++) {
        if(mysteryWord.charAt(i) != ' ' ) {
            hiddenWord += "?";

        }
        else {
            hiddenWord += " ";
            trackSpace+="" + i;
        }
        convertWord += i;

    }
    tv.setText(hiddenWord);
}

public boolean checkWin(){
    if(convertWord.equals(mysteryWord)) {
        won = 1;
        displayMsg("Congratulation, You won!");
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

    String temp ="";
    temp = convertWord;
    boolean replaced = false;

    for(int i = 0; i<mysteryWord.length(); i++){
        String str1 = ""+i;

        if(character == mysteryWord.charAt(i) && (str1.charAt(0) == convertWord.charAt(i)) ){

            char ch1 = str1.charAt(0);
            temp = temp.replace( ch1 , character );
            replaced = true;
        }
    }
    convertWord = temp;

    for(int i = 0; i<mysteryWord.length(); i++){
        String str2 = ""+i;
        char ch2 = str2.charAt(0);

            if( ch2 == temp.charAt(i) ){
            temp = temp.replace(ch2, '?');
        }
    }
    hiddenWord = temp;

    if(replaced) {
        tv.setText(hiddenWord);
    }
    else {
        remainingTurn--;
        drawMen(remainingTurn);
    }
    updateTries();
}

public int countNumberOfWord(){

    BufferedReader reader;
    int numberOfWords = 0;

    try{
        final InputStream file = getAssets().open("file.txt");
        reader = new BufferedReader(new InputStreamReader(file));
        String line = reader.readLine();
        while(line != null){
            numberOfWords++;
            Log.d("StackOverflow", line);
            line = reader.readLine();
        }
    } catch(IOException ioe){
        ioe.printStackTrace();
    }

        return numberOfWords;
}

public void restart(){

    //choose another word
    setWord();

    //reset won to 0
    won = 0;

    //reset remaining turn to 7
    remainingTurn = 7;

    //reset textviews
    countDown.setText("7");

    //reset hangman drawing
    hangImg.setImageResource(R.drawable.hangman);

    //reset all invisible letters
    btnA.setVisibility(View.VISIBLE);
    btnB.setVisibility(View.VISIBLE);
    btnC.setVisibility(View.VISIBLE);
    btnD.setVisibility(View.VISIBLE);
    btnE.setVisibility(View.VISIBLE);
    btnF.setVisibility(View.VISIBLE);
    btnG.setVisibility(View.VISIBLE);
    btnH.setVisibility(View.VISIBLE);
    btnI.setVisibility(View.VISIBLE);
    btnJ.setVisibility(View.VISIBLE);
    btnK.setVisibility(View.VISIBLE);
    btnL.setVisibility(View.VISIBLE);
    btnM.setVisibility(View.VISIBLE);
    btnN.setVisibility(View.VISIBLE);
    btnO.setVisibility(View.VISIBLE);
    btnP.setVisibility(View.VISIBLE);
    btnQ.setVisibility(View.VISIBLE);
    btnR.setVisibility(View.VISIBLE);
    btnS.setVisibility(View.VISIBLE);
    btnT.setVisibility(View.VISIBLE);
    btnU.setVisibility(View.VISIBLE);
    btnV.setVisibility(View.VISIBLE);
    btnW.setVisibility(View.VISIBLE);
    btnX.setVisibility(View.VISIBLE);
    btnY.setVisibility(View.VISIBLE);
    btnZ.setVisibility(View.VISIBLE);
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
                        restart();
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