package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Prevention2 extends AppCompatActivity {

    ImageView home, search;
    Button button1;
    Button donation;
    CardView Elecdownload;
    Dialog mDialog;
    String u = "https://apps.who.int/iris/rest/bitstreams/1328457/retrieve";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention2);


        donation = findViewById(R.id.donation);


        donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = new Dialog(Prevention2.this);
                mDialog.setContentView(R.layout.pop);
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();

                startActivity(new Intent(Prevention2.this, Donation.class));
            }
        });


        button1 = findViewById(R.id.button1);


        Elecdownload = findViewById(R.id.Elecdownload);

        Elecdownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == Elecdownload) {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(u));
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Toast.makeText(Prevention2.this, "Download Complete -  Notification", Toast.LENGTH_LONG).show();

                    DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                    downloadManager.enqueue(request);


                }
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 011-23978046")));
            }
        });

        home = findViewById(R.id.home);
        search = findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Prevention2.this, CovidStarting.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Prevention2.this, Second_Activity.class));
            }
        });

        getSupportActionBar().hide();
    }
}