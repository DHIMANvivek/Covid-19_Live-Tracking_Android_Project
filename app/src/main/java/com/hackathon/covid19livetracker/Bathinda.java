package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bathinda extends AppCompatActivity {

    ImageView pile, pilelocation, bath, bathlocation, ivy, ivylocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathinda);

        ivy = findViewById(R.id.ivy);
        pile = findViewById(R.id.pile);
        pilelocation = findViewById(R.id.pilelocation);
        bath = findViewById(R.id.bath);
        bathlocation = findViewById(R.id.bathlocation);
        ivylocation = findViewById(R.id.ivylocation);

        ivy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911645122000"));
                startActivity(intent);
            }
        });

        ivylocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Ivy Hospital, Bathinda, Mansa Rd, Harbans Nagar, Nacchatar Nagar, Bathinda, Punjab 151005"
                ));
                startActivity(intent);
            }
        });

        bath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911642211299"));
                startActivity(intent);
            }
        });

        bathlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Bathinda Neurospine and Trauma Centre, 40 Feet Rd, Street, No 03, Bibi Wala Rd, Near Bakhshi Hospital, Bathinda, Punjab 151001"
                ));
                startActivity(intent);
            }
        });

        pile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919815664440"));
                startActivity(intent);
            }
        });

        pilelocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Bathinda Piles Hospital, Power House Rd, opposite power grid, Model Town Phase 2, Model Town, Bathinda, Punjab 151001"
                ));
                startActivity(intent);
            }
        });


    }
}