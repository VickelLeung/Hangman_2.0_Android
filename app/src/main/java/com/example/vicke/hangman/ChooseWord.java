package com.example.vicke.hangman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChooseWord extends AppCompatActivity {

    private Button submit, mainMenu;
    private EditText userWord;
    private static String word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseword);

        submit = (Button) findViewById(R.id.btnSubmit);
        mainMenu = (Button) findViewById(R.id.btnMainMenu);
        userWord = (EditText) findViewById(R.id.userWord);

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseWord.this, MainActivity.class);
                startActivity(intent);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //check if input is a number
                if(!checkDigit()) {

                    //check if text is empty
                    if (!checkEmpty()) {
                        //set edit text input as word
                        word = userWord.getText().toString();

                        //move to second activity
                        Intent intent = new Intent(ChooseWord.this, playPlayer.class);
                        startActivity(intent);
                    }
                }
                else
                    Toast.makeText(getApplicationContext(), "Your word cannot contains a digit",
                            Toast.LENGTH_SHORT).show();

            }
        });

    }



public boolean checkEmpty(){

        if(userWord.getText().toString() == null || userWord.getText().toString().length() == 0 )
        return true;

        return false;
}


public boolean checkDigit(){

        for(int i = 0; i<userWord.getText().toString().length(); i++ ){

            switch(userWord.getText().charAt(i)){
                case '0':
                    return true;
                case '1':
                    return true;
                case '2':
                    return true;
                case '3':
                    return true;
                case '4':
                    return true;
                case '5':
                    return true;
                case '6':
                    return true;
                case '7':
                    return true;
                case '8':
                    return true;
                case '9':
                    return true;
            }

        }

        return false;

    }

    //return user word
    public static String getWord(){
        return word;
    }

}

