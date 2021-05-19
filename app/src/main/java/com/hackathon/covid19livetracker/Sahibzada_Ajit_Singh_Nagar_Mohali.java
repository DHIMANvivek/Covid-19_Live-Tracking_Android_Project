package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sahibzada_Ajit_Singh_Nagar_Mohali extends AppCompatActivity {

    ImageView foor, foorlocation, shallocation, shall, oolocation, oo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahibzada_ajit_singh_nagar_mohali);

        foor = findViewById(R.id.foor);
        foorlocation = findViewById(R.id.foorlocation);
        shall = findViewById(R.id.shall);
        shallocation = findViewById(R.id.shallocation);
        oo = findViewById(R.id.oo);
        oolocation = findViewById(R.id.oolocation);

        foor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911724692222"));
                startActivity(intent);
            }
        });

        foorlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=  Fortis Hospital Mohali, Sector 62, Sahibzada Ajit Singh Nagar, Punjab 160062"
                ));
                startActivity(intent);
            }
        });

        shall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911724907100"));
                startActivity(intent);
            }
        });

        shallocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=near PCA Stadium, Phase 9, Sector 63, Sahibzada Ajit Singh Nagar, Chandigarh 160062"
                ));
                startActivity(intent);
            }
        });

        oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911722295000"));
                startActivity(intent);
            }
        });

        oolocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Sohana Hospital Sector 77, Mohali Multi Super Specialty Hospital, Sahibzada Ajit Singh Nagar, Punjab 140308"
                ));
                startActivity(intent);
            }
        });

    }
}