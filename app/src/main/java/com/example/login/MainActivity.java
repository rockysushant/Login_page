package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.Fragments.AccountFragment;
import com.example.login.Fragments.CartFragment;
import com.example.login.Fragments.CategoriesFragment;
import com.example.login.Fragments.HomeFragment;
import com.example.login.Fragments.NotificationFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // UPPER ACTION BAR(40,41)

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);
//        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));



        bnView = findViewById(R.id.bnView);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_home) {
                    loadFrag(new HomeFragment(), false);
//                    getSupportActionBar().hide();
//                    getSupportActionBar().setTitle(" Home");


                }
//                else if (id == R.id.nav_categories) {
//
//                    loadFrag(new CategoriesFragment(), false);
//                    getSupportActionBar().show();
//                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
//                    getSupportActionBar().setTitle(" All Categories");


//                }
                else if (id == R.id.nav_notification) {
                    loadFrag(new NotificationFragment(), false);
//                    getSupportActionBar().show();
//                    getSupportActionBar().setTitle("Notification");

                }
//                else if (id == R.id.nav_cart) {
//                    loadFrag(new CartFragment(), false);
////                    getSupportActionBar().show();
////                    getSupportActionBar().setTitle("Cart");

//                }
                else if (id == R.id.nav_account) {
                    loadFrag(new AccountFragment(), false);
//                    getSupportActionBar().show();
//                    getSupportActionBar().setTitle("Account");

                }
                return true;

            }
        });

        bnView.setSelectedItemId(R.id.nav_home);

//        bnView.setOnNavigationItemSelectedListener(R.id.nav_home);

    }



    @SuppressLint("SuspiciousIndentation")
    public void loadFrag(Fragment fragment, boolean flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag) {
            ft.add(R.id.container, fragment);
            fm.popBackStack();
        } else
            ft.replace(R.id.container, fragment);
        ft.addToBackStack(null);
        ft.commit();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logoutmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
                logoutUser();
                break;


        }
        return super.onOptionsItemSelected(item);
    }

    private void logoutUser() {


    }
}