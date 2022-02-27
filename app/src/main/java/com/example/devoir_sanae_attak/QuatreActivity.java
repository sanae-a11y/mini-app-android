package com.example.devoir_sanae_attak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class QuatreActivity extends AppCompatActivity {
    ImageView quatre ,lire,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quatre);

        quatre = (ImageView) findViewById(R.id.quatre);
        lire = (ImageView) findViewById(R.id.lire4);
        back = (ImageView) findViewById(R.id.back4);
        lire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"QUATRE !!!",Toast.LENGTH_LONG).show();

                MediaPlayer media = MediaPlayer.create(getApplicationContext(),R.raw.a4);
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