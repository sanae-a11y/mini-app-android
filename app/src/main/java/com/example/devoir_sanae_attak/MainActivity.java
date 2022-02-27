package com.example.devoir_sanae_attak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView un, deux, trois, quatre, cinq, six, sept, huit, neuf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        un = (ImageView) findViewById(R.id.i1);
        deux = (ImageView) findViewById(R.id.i2);
        trois = (ImageView) findViewById(R.id.i3);
        quatre = (ImageView) findViewById(R.id.i4);
        cinq = (ImageView) findViewById(R.id.i5);
        six = (ImageView) findViewById(R.id.i6);
        sept = (ImageView) findViewById(R.id.i7);
        huit = (ImageView) findViewById(R.id.i8);
        neuf = (ImageView) findViewById(R.id.i9);


        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UnActivity.class);
                startActivity(i);

            }


        });
        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DeuxActivity.class);
                startActivity(i);

            }


        });

        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), TroisActivity.class);
                startActivity(i);

            }


        });

        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, QuatreActivity.class);
                startActivity(intent);
            }
        });

        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, CinqActivity.class);
                startActivity(intent);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SixActivity.class);
                startActivity(intent);
            }
        });
        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SeptActivity.class);
                startActivity(intent);
            }
        });
        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, HuitActivity.class);
                startActivity(intent);
            }
        });
        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, NeufActivity.class);
                startActivity(intent);
            }
        });


    }


}



