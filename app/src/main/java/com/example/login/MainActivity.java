package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.Fragments.AccountFragment;
import com.example.login.Fragments.CartFragment;
import com.example.login.Fragments.CategoriesFragment;
import com.example.login.Fragments.HomeFragment;
import com.example.login.Fragments.NotificationFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bnView = findViewById(R.id.bnView);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id==R.id.nav_home){
                    loadFrag(new HomeFragment(),false);
//                    getSupportActionBar().hide();


                }else if(id==R.id.nav_categories){

                    loadFrag(new CategoriesFragment(),false);
//                    getSupportActionBar().show();
//                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
//                    getSupportActionBar().setTitle(" All Categories");


                }else if(id==R.id.nav_notification){
                    loadFrag(new NotificationFragment(),false);
//                    getSupportActionBar().show();
//                    getSupportActionBar().setTitle("Notification");

                }else if(id==R.id.nav_cart){
                    loadFrag(new CartFragment(),false);
//                    getSupportActionBar().show();
//                    getSupportActionBar().setTitle("Cart");

                }else if(id==R.id.nav_account){
                    loadFrag( new AccountFragment(),false);
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
    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag) {
            ft.add(R.id.container, fragment);
            fm.popBackStack();
        }else
            ft.replace(R.id.container,fragment);
        ft.addToBackStack(null);
        ft.commit();

    }


}