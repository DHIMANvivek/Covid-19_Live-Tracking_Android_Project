package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class secondpass extends AppCompatActivity {

    ImageView ivBack2;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpass);
        ivBack2 = findViewById(R.id.ivBack2);
        btn2 = findViewById(R.id.btn2);


        ivBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondpass.this, firstpass.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn2) {


                    Intent intent = new Intent(getApplicationContext(), webview2.class);
                    startActivity(intent);


                }
            }
        });

    }
}