package com.example.devoir_sanae_attak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DeuxActivity extends AppCompatActivity {
    ImageView deux ,lire,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deux);


        deux = (ImageView) findViewById(R.id.deux);
        lire = (ImageView) findViewById(R.id.lire2);
        back = (ImageView) findViewById(R.id.b2);
        MediaPlayer media = MediaPlayer.create(getApplicationContext(), R.raw.a2);
        lire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "DEUX !!!", Toast.LENGTH_LONG).show();
                media.start();

            }

        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }

        });

    }

}
