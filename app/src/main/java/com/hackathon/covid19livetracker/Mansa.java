package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mansa extends AppCompatActivity {

    ImageView distrlocation, distr, sublocation, sub, ss, sslocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mansa);


        distr = findViewById(R.id.distr);
        distrlocation = findViewById(R.id.distrlocation);
        sub = findViewById(R.id.sub);
        sublocation = findViewById(R.id.sublocation);
        ss = findViewById(R.id.ss);
        sslocation = findViewById(R.id.sslocation);


        distr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+91652222369"));
                startActivity(intent);
            }
        });

        distrlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=  Water Works Road ,Mansa 151505"
                ));
                startActivity(intent);
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911652250073"));
                startActivity(intent);
            }
        });

        sublocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Budhlada 151502\n" +
                        "\n"
                ));
                startActivity(intent);
            }
        });

        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911612115203"));
                startActivity(intent);
            }
        });

        sslocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Sardulgarh, Mansa 151507"
                ));
                startActivity(intent);
            }
        });

    }
}