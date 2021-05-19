package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Moga extends AppCompatActivity {
    ImageView satya, satyalocation, goel, goellocation, mi, milocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moga);


        satya = findViewById(R.id.satya);
        satyalocation = findViewById(R.id.satyalocation);
        goel = findViewById(R.id.goel);
        goellocation = findViewById(R.id.goellocation);
        mi = findViewById(R.id.mi);
        milocation = findViewById(R.id.milocation);


        satya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+91228688"));
                startActivity(intent);
            }
        });

        satyalocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Railway Station, 127, Railway Road, Opp:, New Town, Moga, Punjab 142001"
                ));
                startActivity(intent);
            }
        });


        goel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+91222758"));
                startActivity(intent);
            }
        });

        goellocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Main Bazaar, Dashmesh Nagar, Moga, Punjab 142001"
                ));
                startActivity(intent);
            }
        });

        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+91233111"));
                startActivity(intent);
            }
        });

        milocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Old Dusshera Ground Road, opposite New Telephone Exchange, Anand Nagar, Moga, Punjab 142001"
                ));
                startActivity(intent);
            }
        });


    }
}