package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Patiala extends AppCompatActivity {

    ImageView meh, mehlocation, nitlocation, nit, col, collocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patiala);

        meh = findViewById(R.id.meh);
        mehlocation = findViewById(R.id.mehlocation);
        nit = findViewById(R.id.nit);
        nitlocation = findViewById(R.id.nitlocation);
        col = findViewById(R.id.col);
        collocation = findViewById(R.id.collocation);

        meh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919872209223"));
                startActivity(intent);
            }
        });

        mehlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Banna Road, near Punjab and Sind Bank, Factory Area, Abchal Nagar, Patiala, Punjab 147003"
                ));
                startActivity(intent);
            }
        });

        nit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911752214767"));
                startActivity(intent);
            }
        });

        nitlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=SCO 45-46, New, Leela Bhawan, Market, Patiala, Punjab 147001"
                ));
                startActivity(intent);
            }
        });

        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911755000222"));
                startActivity(intent);
            }
        });

        collocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Bhupindra Road, Near 22 No. Phatak, Patiala, Punjab 147001"
                ));
                startActivity(intent);
            }
        });


    }
}