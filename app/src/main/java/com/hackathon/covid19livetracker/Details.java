package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Details extends AppCompatActivity {

    CardView hospital, med;
    CardView pre;
    CardView cc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        cc = findViewById(R.id.cc);

        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Details.this, firstpass.class));
            }
        });

        hospital = findViewById(R.id.hospital);

        med = findViewById(R.id.med);
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Details.this, MedicalProblems.class));
            }
        });

        pre = findViewById(R.id.pre);

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Details.this, Preventions.class));
            }
        });

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Details.this, Hospital.class));
            }
        });
    }
}