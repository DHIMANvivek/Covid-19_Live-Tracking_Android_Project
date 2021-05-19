package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Muktsar extends AppCompatActivity {

    ImageView m, mlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muktsar);

        m = findViewById(R.id.m);
        mlocation = findViewById(R.id.mlocation);


        m = findViewById(R.id.m);
        mlocation = findViewById(R.id.mlocation);


        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919216782777"));
                startActivity(intent);
            }
        });

        mlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= MUKTSAR MEDICITY HOSPITAL, Canal Colony, Sri Muktsar Sahib, Punjab 152026"
                ));
                startActivity(intent);
            }
        });


    }
}