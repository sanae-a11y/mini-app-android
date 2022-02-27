package com.example.devoir_sanae_attak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HuitActivity extends AppCompatActivity {
    ImageView huit ,lire,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huit);

        huit = (ImageView) findViewById(R.id.huit);
        lire = (ImageView) findViewById(R.id.lire8);
        back = (ImageView) findViewById(R.id.back8);
        lire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"HUIT !!!",Toast.LENGTH_LONG).show();

                MediaPlayer media = MediaPlayer.create(getApplicationContext(),R.raw.a8);
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