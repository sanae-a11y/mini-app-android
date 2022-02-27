package com.example.devoir_sanae_attak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TroisActivity extends AppCompatActivity {
    ImageView trois ,lire,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trois);

        trois = (ImageView) findViewById(R.id.trois);
        lire = (ImageView) findViewById(R.id.lire3);
        back = (ImageView) findViewById(R.id.back3);
        lire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"TROIS !!!",Toast.LENGTH_LONG).show();

                MediaPlayer media = MediaPlayer.create(getApplicationContext(),R.raw.a3);
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