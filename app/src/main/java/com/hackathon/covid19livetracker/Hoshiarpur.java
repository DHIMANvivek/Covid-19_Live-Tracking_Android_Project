package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Hoshiarpur extends AppCompatActivity {

    ImageView dogra, dogralocation, chopra, chopralocation, sai, sailocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoshiarpur);


        dogra = findViewById(R.id.dogra);
        dogralocation = findViewById(R.id.dogralocation);
        chopra = findViewById(R.id.chopra);
        chopralocation = findViewById(R.id.chopralocation);
        sai = findViewById(R.id.sai);
        sailocation = findViewById(R.id.sailocation);


        dogra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919814433931"));
                startActivity(intent);
            }
        });

        dogralocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Chota Bhagowal,\n" +
                        "Near Dussehra Ground, Chota Bhagowal,\n" +
                        "Mukerian, Hoshiarpur"
                ));
                startActivity(intent);
            }
        });


        chopra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919814303819"));
                startActivity(intent);
            }
        });

        chopralocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=College Road, Dasuya,\n" +
                        "Hoshiarpur"
                ));
                startActivity(intent);
            }
        });

        sai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919815028742"));
                startActivity(intent);
            }
        });

        sailocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Committee Bazar,\n" +
                        "Near Town Hall, Committee Bazar,\n" +
                        "Hoshiarpur"
                ));
                startActivity(intent);
            }
        });

    }
}