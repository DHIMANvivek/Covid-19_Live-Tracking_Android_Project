package com.hackathon.covid19livetracker;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;


import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Spinner;


public class Hospital extends AppCompatActivity {

    Spinner sp1;


    String[] arr = {"Select Your District", "Amritsar", "Barnala", "Bathinda", "Faridkot", "Fatehgarh Sahib", "Fazilka", "Ferozepur",
            "Gurdaspur", "Hoshiarpur", "Jalandhar", "Kapurthala", "Ludhiana", "Mansa", "Moga", "Muktsar", "Nawanshahr",
            "Pathankot", "Patiala", "Rupnagar", "Sahibzada Ajit Singh Nagar (Mohali)", "Sangrur", "Tarn Taran"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


        sp1 = findViewById(R.id.sp1);


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(Hospital.this, android.R.layout.simple_list_item_1, arr);
        sp1.setAdapter(arrayAdapter1);


        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).equals("Amritsar")) {
                    startActivity(new Intent(Hospital.this, Amritsar.class));
                }

                if (parent.getItemAtPosition(position).equals("Barnala")) {
                    startActivity(new Intent(Hospital.this, Barnala.class));
                }
                if (parent.getItemAtPosition(position).equals("Bathinda")) {
                    startActivity(new Intent(Hospital.this, Bathinda.class));
                }
                if (parent.getItemAtPosition(position).equals("Faridkot")) {
                    startActivity(new Intent(Hospital.this, Faridkot.class));
                }
                if (parent.getItemAtPosition(position).equals("Fatehgarh Sahib")) {
                    startActivity(new Intent(Hospital.this, Fatehgarh_Sahib.class));
                }
                if (parent.getItemAtPosition(position).equals("Fazilka")) {
                    startActivity(new Intent(Hospital.this, Fazilka.class));
                }
                if (parent.getItemAtPosition(position).equals("Ferozepur")) {
                    startActivity(new Intent(Hospital.this, Ferozepur.class));
                }
                if (parent.getItemAtPosition(position).equals("Gurdaspur")) {
                    startActivity(new Intent(Hospital.this, Gurdaspur.class));
                }
                if (parent.getItemAtPosition(position).equals("Hoshiarpur")) {
                    startActivity(new Intent(Hospital.this, Hoshiarpur.class));
                }
                if (parent.getItemAtPosition(position).equals("Jalandhar")) {
                    startActivity(new Intent(Hospital.this, Jalandhar.class));
                }
                if (parent.getItemAtPosition(position).equals("Kapurthala")) {
                    startActivity(new Intent(Hospital.this, Kapurthala.class));
                }
                if (parent.getItemAtPosition(position).equals("Ludhiana")) {
                    startActivity(new Intent(Hospital.this, Ludhiana.class));
                }
                if (parent.getItemAtPosition(position).equals("Mansa")) {
                    startActivity(new Intent(Hospital.this, Mansa.class));
                }
                if (parent.getItemAtPosition(position).equals("Moga")) {
                    startActivity(new Intent(Hospital.this, Moga.class));
                }
                if (parent.getItemAtPosition(position).equals("Muktsar")) {
                    startActivity(new Intent(Hospital.this, Muktsar.class));
                }
                if (parent.getItemAtPosition(position).equals("Nawanshahr")) {
                    startActivity(new Intent(Hospital.this, Nawanshahr.class));
                }
                if (parent.getItemAtPosition(position).equals("Pathankot")) {
                    startActivity(new Intent(Hospital.this, Pathankot.class));
                }
                if (parent.getItemAtPosition(position).equals("Patiala")) {
                    startActivity(new Intent(Hospital.this, Patiala.class));
                }
                if (parent.getItemAtPosition(position).equals("Rupnagar")) {
                    startActivity(new Intent(Hospital.this, Rupnagar.class));
                }
                if (parent.getItemAtPosition(position).equals("Sahibzada Ajit Singh Nagar (Mohali)")) {
                    startActivity(new Intent(Hospital.this, Sahibzada_Ajit_Singh_Nagar_Mohali.class));
                }
                if (parent.getItemAtPosition(position).equals("Sangrur")) {
                    startActivity(new Intent(Hospital.this, Sangrur.class));
                }
                if (parent.getItemAtPosition(position).equals("Tarn Taran")) {
                    startActivity(new Intent(Hospital.this, Tarn_Taran.class));
                }


            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


}
















