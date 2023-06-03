//package com.example.login.Settings;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//
//public class SharedPreference {
//    private  static  String SHARED_PREF_NAME = "HELLO";
//    private SharedPreferences sharedPreferences;
//    Context context;
//    private SharedPreference.Editor editor;
//
//
//    private SharedPreference(Context context){
//        this.context = context;
//
//
//
//        void logout(){
//            sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
//            editor = sharedPreferences.edit();
//            editor.clear();
//            editor.apply();
//
//        }
//    }
//
//
//
//}
