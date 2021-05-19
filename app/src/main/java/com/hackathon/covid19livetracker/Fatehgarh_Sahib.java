package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Fatehgarh_Sahib extends AppCompatActivity {
    ImageView lohia, lohialocation, baba, babalocation, nurse, nurselocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatehgarh_sahib);


        lohia = findViewById(R.id.lohia);
        lohialocation = findViewById(R.id.lohialocation);
        baba = findViewById(R.id.baba);
        babalocation = findViewById(R.id.babalocation);
        nurse = findViewById(R.id.nurse);
        nurselocation = findViewById(R.id.nurselocation);


        lohia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911763232232"));
                startActivity(intent);
            }
        });

        lohialocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Akhara Rd, Dashnami Akhara, Fatehgarh Sahib, Punjab 140406"
                ));
                startActivity(intent);
            }
        });


        baba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911763232255"));
                startActivity(intent);
            }
        });

        babalocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Fatehgarh Sahib, Punjab 140407"
                ));
                startActivity(intent);
            }
        });

        nurse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911763224000"));
                startActivity(intent);
            }
        });

        nurselocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Sirhind Morinda Road, near Dhillon Eye Hospital, Sirhind, Punjab 140406"
                ));
                startActivity(intent);
            }
        });


    }
}