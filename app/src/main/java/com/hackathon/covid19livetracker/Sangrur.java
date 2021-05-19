package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sangrur extends AppCompatActivity {

    ImageView sanglocation, sang, care, carelocation, rur, rurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangrur);

        sang = findViewById(R.id.sang);
        sanglocation = findViewById(R.id.sanglocation);
        care = findViewById(R.id.care);
        carelocation = findViewById(R.id.carelocation);
        rur = findViewById(R.id.rur);
        rurl = findViewById(R.id.rurl);

        sang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919150102929"));
                startActivity(intent);
            }
        });

        sanglocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=  Chamber Rd, opposite Ganesh Mandir, A.P Enclave, Dhuri, Punjab 148024"
                ));
                startActivity(intent);
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919888816896"));
                startActivity(intent);
            }
        });

        carelocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=near PCA Stadium, Phase 9, Sector 63, Sahibzada Ajit Singh Nagar, Chandigarh 160062"
                ));
                startActivity(intent);
            }
        });

        rur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+918872710359"));
                startActivity(intent);
            }
        });

        rurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=  Gaushalla Road, Bhai Bir Singh Nagar, Ahmedgarh, Punjab 148021"
                ));
                startActivity(intent);
            }
        });


    }
}