//package com.epicodus.moneymanagement.models;
//
//
//import android.content.Context;
//import android.content.SharedPreferences;
//import android.content.pm.PackageInstaller;
//import android.preference.PreferenceManager;
//
//import java.util.List;
//
///**
// * Created by nataliyamiller on 11/12/15.
// */
//public class SessionManager {
//    public static final String PREFS = "userDetails";
//    SharedPreferences mSharedPreferences;
//    SharedPreferences.Editor mEditor;
//
//    public SessionManager(Context context) {
//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
//    }
//
////    public SessionManager(Context context) {
////        mSharedPreferences = context.getSharedPreferences(PREFS, 0);
////    }
//
//    public void storeUserData(User user) {
//        mEditor = mSharedPreferences.edit();
//        mEditor.putString("username", user.getUsername());
//        mEditor.putString("password", user.getPassword());
//        mEditor.putString("email", user.getEmail());
//        mEditor.apply();
//
//    }
//
//    public User getLoggedInUser() {
//        String username = mSharedPreferences.getString("username", "");
//        String password = mSharedPreferences.getString("password", "");
//        String email = mSharedPreferences.getString("email", "");
//
//        User storedUser = new User(username, password, email);
//        return storedUser;
//        }
//
//    public boolean getUserLoggedIn() {
//        if(mSharedPreferences.getBoolean("loggedIn", false) == true) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void setUserLoggedIn(boolean loggedIn) {
//        mEditor = mSharedPreferences.edit();
//        mEditor.putBoolean("loggedIn", loggedIn);
//        mEditor.apply();
//    }
//
//    public void clearUserData() {
//        mEditor = mSharedPreferences.edit();
//        mEditor.clear();
//        mEditor.apply();
//    }
//}
