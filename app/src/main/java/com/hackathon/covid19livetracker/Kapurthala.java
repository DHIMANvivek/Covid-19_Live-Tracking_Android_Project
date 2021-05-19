package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Kapurthala extends AppCompatActivity {
    ImageView g, glocation, mat, matlocation, ba, balocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapurthala);

        g = findViewById(R.id.g);
        glocation = findViewById(R.id.glocation);
        mat = findViewById(R.id.mat);
        matlocation = findViewById(R.id.matlocation);
        ba = findViewById(R.id.ba);
        balocation = findViewById(R.id.balocation);


        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911822233432"));
                startActivity(intent);
            }
        });

        glocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q= 3, Kartarpur Road,, Near D.C.Chowk, Kapurthala"
                ));
                startActivity(intent);
            }
        });


        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911822232484"));
                startActivity(intent);
            }
        });

        matlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=60, Germany Dass Park, Kapurthala"
                ));
                startActivity(intent);
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911822-231763"));
                startActivity(intent);
            }
        });

        balocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=130, Peer Choudhary Road, Kapurthala\n"
                ));
                startActivity(intent);
            }
        });

    }
}