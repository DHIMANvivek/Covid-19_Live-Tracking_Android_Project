package com.hackathon.covid19livetracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.MailTo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class CovidStarting extends AppCompatActivity {

    Button stat, button, button2;
    TextView name;
    NotificationManager nm;
    Vibrator vibrator;

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Already in Home Page", Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Hospitals");
        menu.add("Live Report");
        menu.add("Medical");
        menu.add("E-Passes");
        menu.add("Vaccination");
        menu.add("Donation");
        menu.add("Intro Of App");
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getTitle().equals("Hospitals")) {
            startActivity(new Intent(CovidStarting.this, Hospital.class));
        }
        if (item.getTitle().equals("Live Report")) {
            startActivity(new Intent(CovidStarting.this, ThirdActivity.class));
        }
        if (item.getTitle().equals("Medical")) {
            startActivity(new Intent(CovidStarting.this, MedicalProblems.class));
        }
        if (item.getTitle().equals("E-Passes")) {
            startActivity(new Intent(CovidStarting.this, firstpass.class));
        }
        if (item.getTitle().equals("Vaccination")) {
            startActivity(new Intent(CovidStarting.this, secondpass.class));
        }
        if (item.getTitle().equals("Donation")) {
            startActivity(new Intent(CovidStarting.this, Donation.class));
        }
        if (item.getTitle().equals("Intro Of App")) {
            startActivity(new Intent(CovidStarting.this, MainActivity2.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_starting);

        stat = findViewById(R.id.stat);
        button = findViewById(R.id.button);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        button2 = findViewById(R.id.button2);
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"ncov2019@gov.in"});


                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));
            }
        });

        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == stat) {
                    String channelId = "channelId";
                    String channelname = " channel-name";
                    NotificationCompat.Builder nb = new NotificationCompat.Builder(CovidStarting.this,channelId);
                    nb.setContentTitle("Welcome, This Is the Live Statistics Of Covid - 19");
                    nb.setSmallIcon(R.drawable.common_google_signin_btn_icon_dark);
                    nb.setContentText("Developed By - Vivek , Vishal , Vanshika");

                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                        NotificationChannel nc = new NotificationChannel(channelId,channelname,NotificationManager.IMPORTANCE_DEFAULT);
                        nm.createNotificationChannel(nc);
                    }
                    nm.notify((int) System.currentTimeMillis(),nb.build());

                    vibrator.vibrate(50);
                    Intent intent = new Intent(CovidStarting.this, Second_Activity.class);
                    startActivity(intent);



                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 011-23978046")));
            }
        });

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();

            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();

            name.setText(personName);

        }

    }
}