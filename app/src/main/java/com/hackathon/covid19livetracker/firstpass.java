package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class firstpass extends AppCompatActivity {
    private static final Object ACTIVITY_CHOOSE_FILE = 0;
    ImageView ivNext1, ivBack1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpass);
        ivNext1 = findViewById(R.id.ivNext1);
        ivBack1 = findViewById(R.id.ivBack1);
        btn1 = findViewById(R.id.btn1);

        ivNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstpass.this, secondpass.class);
                startActivity(intent);
            }
        });
        ivBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(firstpass.this,Details.class));

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstpass.this, webview.class);
                startActivity(intent);

                Intent chooseFile;
                Intent intent2;
                chooseFile = new Intent(Intent.ACTION_GET_CONTENT);
                chooseFile.addCategory(Intent.CATEGORY_OPENABLE);
                chooseFile.setType("file/*");
                intent2 = Intent.createChooser(chooseFile, "Choose a file");
                startActivityForResult(intent, (Integer) ACTIVITY_CHOOSE_FILE);
            }


        });

    }

    private class ACTIVITY_CHOOSE_FILE {
    }
}