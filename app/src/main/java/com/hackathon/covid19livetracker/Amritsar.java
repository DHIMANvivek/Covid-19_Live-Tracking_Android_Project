package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Amritsar extends AppCompatActivity {

    ImageView amandeep, amanlocation, apex, apexlocation, janta, jantalocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amritsar);

        apex = findViewById(R.id.apex);
        apexlocation = findViewById(R.id.apexlocation);
        janta = findViewById(R.id.janta);
        jantalocation = findViewById(R.id.jantalocation);
        amandeep = findViewById(R.id.amandeep);
        amanlocation = findViewById(R.id.amanlocation);


        janta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919915578049"));
                startActivity(intent);
            }
        });

        jantalocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Opp. Central Jail, Karam Singh Colony, Friends Avenue, Amritsar, Punjab 143001"
                ));
                startActivity(intent);
            }
        });


        apexlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Plot No, 156, Batala Rd, near Rishab Auto, Jawahar Nagar, Amritsar, Punjab 143001"
                ));
                startActivity(intent);
            }
        });


        apex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919814229005"));
                startActivity(intent);
            }
        });


        amandeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919815018786"));
                startActivity(intent);
            }
        });
        amanlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Grand Trunk Rd, Model Town, Rani Ka Bagh, Mohindra Colony, Amritsar, Punjab 143001"));
                startActivity(intent);
            }
        });
    }
}