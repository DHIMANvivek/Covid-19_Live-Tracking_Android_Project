package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Faridkot extends AppCompatActivity {
    ImageView gandhi, gandhilocation, ram, ramlocation, gobind, gobindlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faridkot);

        gandhi = findViewById(R.id.gandhi);
        gandhilocation = findViewById(R.id.gandhilocation);
        ram = findViewById(R.id.ram);
        ramlocation = findViewById(R.id.ramlocation);
        gobind = findViewById(R.id.gobind);
        gobindlocation = findViewById(R.id.gobindlocation);


        gandhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+917947449069"));
                startActivity(intent);
            }
        });

        gandhilocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Faridkot Rd, Guru Har Sahai, Punjab 152022"
                ));
                startActivity(intent);
            }
        });


        ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+917947310525"));
                startActivity(intent);
            }
        });

        ramlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=1, Mall Rd, Kamiana Gate, Faridkot, Punjab 151203"
                ));
                startActivity(intent);
            }
        });


        gobind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+917947143174"));
                startActivity(intent);
            }
        });

        gobindlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Sadiq Rd, Kotakpura, GGS Medical Hospital, Faridkot, Punjab 151203"
                ));
                startActivity(intent);
            }
        });

    }
}