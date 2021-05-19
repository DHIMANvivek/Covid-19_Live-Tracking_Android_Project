package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Pathankot extends AppCompatActivity {

    ImageView mill, milllocation, bala, balalocation, gan, ganlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pathankot);

        mill = findViewById(R.id.mill);
        milllocation = findViewById(R.id.milllocation);
        bala = findViewById(R.id.bala);
        balalocation = findViewById(R.id.balalocation);
        gan = findViewById(R.id.gan);
        ganlocation = findViewById(R.id.ganlocation);

        mill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+918288095902"));
                startActivity(intent);
            }
        });

        milllocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Pathankot - Majra Rd, Dhangu Peer, Pathankot, Punjab 145001"
                ));
                startActivity(intent);
            }
        });

        bala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919646804804"));
                startActivity(intent);
            }
        });

        balalocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Balaji Hospital - Laparoscopic Surgery, Kidney & Dialysis Center, Dhangu Rd, near PNB Bank, Sain Garh, Pathankot, Punjab 145001"
                ));
                startActivity(intent);
            }
        });

        gan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911862225500"));
                startActivity(intent);
            }
        });

        ganlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Mission Rd, Garden Colony, Pathankot, Punjab 145001"
                ));
                startActivity(intent);
            }
        });


    }
}