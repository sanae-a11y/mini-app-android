package com.example.devoir_sanae_attak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CinqActivity extends AppCompatActivity {
    ImageView cinq ,lire,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinq);

        cinq = (ImageView) findViewById(R.id.cinq);
        lire = (ImageView) findViewById(R.id.lire5);
        back = (ImageView) findViewById(R.id.back5);
        lire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"CINQ !!!",Toast.LENGTH_LONG).show();

                MediaPlayer media = MediaPlayer.create(getApplicationContext(),R.raw.a5);
                media.start();

            }

        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }


        });
    }
}