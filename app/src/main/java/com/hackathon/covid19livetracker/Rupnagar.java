package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Rupnagar extends AppCompatActivity {

    ImageView rup, ruplocation, gilllocation, gill, nurlocation, nur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupnagar);

        rup = findViewById(R.id.rup);
        ruplocation = findViewById(R.id.ruplocation);
        gill = findViewById(R.id.gill);
        gilllocation = findViewById(R.id.gilllocation);
        nur = findViewById(R.id.nur);
        nurlocation = findViewById(R.id.nurlocation);

        rup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919781998609"));
                startActivity(intent);
            }
        });

        ruplocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=  13, 13, Giani Zail Singh Nagar, Rupnagar, Punjab 140001"
                ));
                startActivity(intent);
            }
        });

        gill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911881225175"));
                startActivity(intent);
            }
        });

        gilllocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=226, Baba Deep Singh Nagar, Jagjit Nagar, Power Colony,"
                ));
                startActivity(intent);
            }
        });

        nur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+917837420707"));
                startActivity(intent);
            }
        });

        nurlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Sun city, City, Rupnagar, Punjab 140001"
                ));
                startActivity(intent);
            }
        });


    }
}