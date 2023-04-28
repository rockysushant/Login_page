package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataBase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);


       DatabaseReference databaseReference =  FirebaseDatabase.getInstance().getReference("CopyWright");
       databaseReference.setValue("Copy Wright ");

       DatabaseReference contactRef = FirebaseDatabase.getInstance().getReference("Contacts");
       String contactID =  contactRef.push().getKey();

       ContactModel contactModel = new ContactModel("Sushant","8789675741");
       contactRef.child(contactID).setValue(contactModel);






    }
}