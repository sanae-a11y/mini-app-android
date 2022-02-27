package com.example.devoir_sanae_attak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SixActivity extends AppCompatActivity {
    ImageView six ,lire,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        six = (ImageView) findViewById(R.id.six);
        lire = (ImageView) findViewById(R.id.lire6);
        back = (ImageView) findViewById(R.id.back6);
        lire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"SIX !!!",Toast.LENGTH_LONG).show();

                MediaPlayer media = MediaPlayer.create(getApplicationContext(),R.raw.a6);
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