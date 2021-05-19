package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ludhiana extends AppCompatActivity {

    ImageView fort, fortlocation, dmc, dmclocation, cm, cmlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ludhiana);

        fort = findViewById(R.id.fort);
        fortlocation = findViewById(R.id.fortlocation);
        dmc = findViewById(R.id.dmc);
        dmclocation = findViewById(R.id.dmclocation);
        cm = findViewById(R.id.cm);
        cmlocation = findViewById(R.id.cmlocation);


        fort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+91161-5222222"));
                startActivity(intent);
            }
        });

        fortlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=  Near Radha Swami Satsang Bhavan (Mudhian Kalan village), Chandigarh Rd, Ludhiana"
                ));
                startActivity(intent);
            }
        });


        dmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919815555100"));
                startActivity(intent);
            }
        });

        dmclocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Brown Road, Ludhiana"
                ));
                startActivity(intent);
            }
        });

        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911612115203"));
                startActivity(intent);
            }
        });

        cmlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=130, Peer Choudhary Road, Kapurthala\n"
                ));
                startActivity(intent);
            }
        });

    }
}