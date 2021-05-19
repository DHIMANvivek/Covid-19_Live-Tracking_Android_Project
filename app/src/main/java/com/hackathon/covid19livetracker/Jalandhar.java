package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Jalandhar extends AppCompatActivity {
    ImageView oxford, oxfordlocation, capitol, capitollocation, sh, shlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jalandhar);


        oxford = findViewById(R.id.oxford);
        oxfordlocation = findViewById(R.id.oxfordlocation);
        capitol = findViewById(R.id.capitol);
        capitollocation = findViewById(R.id.capitollocation);
        sh = findViewById(R.id.sh);
        shlocation = findViewById(R.id.shlocation);


        oxford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+91181-2233666"));
                startActivity(intent);
            }
        });

        oxfordlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= 305, Lajpat Nagar (Near Nakodar chowk), Jalandhar"
                ));
                startActivity(intent);
            }
        });


        capitol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+918427584275"));
                startActivity(intent);
            }
        });

        capitollocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Near Reru Chowk, Jalandhar- Pathankot Road (NH 44), Jalandhar"
                ));
                startActivity(intent);
            }
        });

        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911815017777"));
                startActivity(intent);
            }
        });

        shlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Jalandhar Pathankot Road, Near Reru Chowk, Jalandhar"
                ));
                startActivity(intent);
            }
        });

    }
}