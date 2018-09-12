package com.example.criticalrole;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;




public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random rng = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice(){

        int randomNumber = rng.nextInt(20) + 1;
        MediaPlayer roll= MediaPlayer.create(MainActivity.this,R.raw.diceroll);
        MediaPlayer miss= MediaPlayer.create(MainActivity.this,R.raw.snakeeyes);
        MediaPlayer crit= MediaPlayer.create(MainActivity.this,R.raw.crit);

        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.d1);
                miss.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d2);
                roll.start();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d3);
                roll.start();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d4);
                roll.start();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d5);
                roll.start();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d6);
                roll.start();
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d7);
                roll.start();
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d8);
                roll.start();
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d9);
                roll.start();
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d10);
                roll.start();
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d11);
                roll.start();
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d12);
                roll.start();
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d13);
                roll.start();
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d14);
                roll.start();
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d15);
                roll.start();
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d16);
                roll.start();
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d17);
                roll.start();
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d18);
                roll.start();
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d19);
                roll.start();
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20);
                crit.start();
                break;

        }
    }
}
