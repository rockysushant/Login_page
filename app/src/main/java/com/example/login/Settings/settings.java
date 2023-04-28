package com.example.login.Settings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import com.example.login.MainActivity;
import com.example.login.R;

public class settings extends AppCompatActivity {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch switcher;

    boolean nightMODE;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


//        TextView settings = findViewById(R.id.settings);
//        settings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                ((MainActivity)getActivity()).loadFrag(new act(), false);
//            }
//        });

//        getSupportActionBar().hide();
//        switcher = findViewById(R.id.switcher);

        // WE USE SHARED PREFERENCE TO SAVE MODE IF

//        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE);

        // LIGHT MODE IS THE DEFAULT MODE

//        nightMODE = sharedPreferences.getBoolean("night",false);
//
//
//
//        if(nightMODE){
//            switcher.setChecked(true);
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//
//
//        }
//
//        switcher.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(nightMODE){
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//                    editor = sharedPreferences.edit();
//                    editor.putBoolean("nigh", false);
//                }else{
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                    editor = sharedPreferences.edit();
//                    editor.putBoolean("nigh", true);
//                }
//                editor.apply();
//            }
//        });
//
//




    }
}