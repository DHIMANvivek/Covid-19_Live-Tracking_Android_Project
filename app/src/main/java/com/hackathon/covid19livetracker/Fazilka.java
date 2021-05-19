package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Fazilka extends AppCompatActivity {

    ImageView ivil, ivillocation, vivek, viveklocation, amrit, amritlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazilka);


        ivil = findViewById(R.id.ivil);
        ivillocation = findViewById(R.id.ivillocation);
        vivek = findViewById(R.id.vivek);
        viveklocation = findViewById(R.id.viveklocation);
        amrit = findViewById(R.id.amrit);
        amritlocation = findViewById(R.id.amritlocation);


        ivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911632250034"));
                startActivity(intent);
            }
        });

        ivillocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=45 79 Jalalabad, Fazilka, Ferozepur – 152123, Near Post Office"
                ));
                startActivity(intent);
            }
        });


        vivek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919592179375"));
                startActivity(intent);
            }
        });

        viveklocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Court Road, Kailash Nagar, Mahavir Colony, Fazilka, Ferozepur – 152123\n"
                ));
                startActivity(intent);
            }
        });

        amrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919815164480"));
                startActivity(intent);
            }
        });

        amritlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Court Road, Fazilka, Ferozepur – 152123, New Post Office"
                ));
                startActivity(intent);
            }
        });


    }
}