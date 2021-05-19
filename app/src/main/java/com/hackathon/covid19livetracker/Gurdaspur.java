package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Gurdaspur extends AppCompatActivity {

    ImageView tilak, tilaklocation, hansh, hanshlocation, bajwa, bajwalocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurdaspur);


        tilak = findViewById(R.id.tilak);
        tilaklocation = findViewById(R.id.tilaklocation);
        hansh = findViewById(R.id.hansh);
        hanshlocation = findViewById(R.id.hanshlocation);
        bajwa = findViewById(R.id.bajwa);
        bajwalocation = findViewById(R.id.bajwalocation);


        tilak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911632250034"));
                startActivity(intent);
            }
        });

        tilaklocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Dhangu Road,\n" +
                        "Gurdaspur - 145001,\n" +
                        "Punjab"
                ));
                startActivity(intent);
            }
        });


        hansh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919915373344"));
                startActivity(intent);
            }
        });

        hanshlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Saingarh Chowk, Dhangu Road, Pathankot,\n" +
                        "Gurdaspur - 145001,\n" +
                        "Punjab"
                ));
                startActivity(intent);
            }
        });

        bajwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911874244899"));
                startActivity(intent);
            }
        });

        bajwalocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=363/5, Civil Lines,\n" +
                        "Gurdaspur - 143521,\n" +
                        "Punjab"
                ));
                startActivity(intent);
            }
        });


    }
}