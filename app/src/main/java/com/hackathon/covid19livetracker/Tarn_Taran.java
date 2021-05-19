package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tarn_Taran extends AppCompatActivity {

    ImageView ta, talocation, vv, vvlocation, dhh, dhhlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarn_taran);

        ta = findViewById(R.id.ta);
        talocation = findViewById(R.id.talocation);
        vv = findViewById(R.id.vv);
        vvlocation = findViewById(R.id.vvlocation);
        dhh = findViewById(R.id.dhh);
        dhhlocation = findViewById(R.id.dhhlocation);

        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919888858454"));
                startActivity(intent);
            }
        });

        talocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=   Goindwal Byepass National Highway 54, near Railway Flyover, Tarn Taran Sahib, Punjab 143401"
                ));
                startActivity(intent);
            }
        });

        vv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911852223060"));
                startActivity(intent);
            }
        });

        vvlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Amritsar Rd, Shri Chander Colony, Tarn Taran Sahib, Punjab 143401"
                ));
                startActivity(intent);
            }
        });

        dhh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919872693917"));
                startActivity(intent);
            }
        });

        dhhlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= Nurdin, Punjab 143401"
                ));
                startActivity(intent);
            }
        });


    }
}