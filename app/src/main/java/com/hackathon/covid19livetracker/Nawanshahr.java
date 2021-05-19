package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Nawanshahr extends AppCompatActivity {

    ImageView chahal, chahallocation, dha, dhalocation, raja, rajalocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nawanshahr);

        chahal = findViewById(R.id.chahal);
        chahallocation = findViewById(R.id.chahallocation);
        dha = findViewById(R.id.dha);
        dhalocation = findViewById(R.id.dhalocation);
        raja = findViewById(R.id.raja);
        rajalocation = findViewById(R.id.rajalocation);

        chahal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919815028654"));
                startActivity(intent);
            }
        });

        chahallocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Dr. Chahal's - JJ HOSPITAL : Orthopedic Doctor | ENT Doctor | Trauma Care Centre in Nawanshahr, Chandigarh Rd, Rai Colony, Nawanshahr, Punjab 144514"
                ));
                startActivity(intent);
            }
        });

        dha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919878485122"));
                startActivity(intent);
            }
        });

        dhalocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Dhawan Hospital, Street No. 6, Guru Angad Nagar, Opp. IT Ground, SBS Nagar, Nawanshahr, Punjab 144500"
                ));
                startActivity(intent);
            }
        });

        raja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+911823508050"));
                startActivity(intent);
            }
        });

        rajalocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=Raja Diagnostic Centre & Hospital, Mota Singh Road, near Civil Surgeon Office, Sirsa Colony, Nawanshahr, Punjab 144514"
                ));
                startActivity(intent);
            }
        });


    }
}