package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Barnala extends AppCompatActivity {

    ImageView civil, civillocation, guru, gurulocation, mano, manolocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barnala);
        mano = findViewById(R.id.mano);
        manolocation = findViewById(R.id.manolocation);
        civil = findViewById(R.id.civil);
        civillocation = findViewById(R.id.civillocation);

        guru = findViewById(R.id.guru);
        gurulocation = findViewById(R.id.gurulocation);

        mano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919023423300"));
                startActivity(intent);
            }
        });

        manolocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Fountain Chownk, near LIC Building, 22 Acre, Barnala, Punjab 148101"
                ));
                startActivity(intent);
            }
        });


        guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+918727000177"));
                startActivity(intent);
            }
        });

        gurulocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Guru Nanak Manorog Hospital - De Addiction Center, Psychiatrist, Psychiatric Hospital in Barnala, 16 Acre ,Shop No. 4, Near Bus Stand, Punjab 148101"
                ));
                startActivity(intent);
            }
        });


        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911679233042"));
                startActivity(intent);
            }
        });

        civillocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Civil Hospital Barnala, KC Rd, Barnala, Punjab 148101"
                ));
                startActivity(intent);
            }
        });


    }
}