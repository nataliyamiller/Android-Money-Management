package com.epicodus.moneymanagement.parse;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by nataliyamiller on 11/23/15.
 */
public class MoneyManagementApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "2dYPdH4gh3s2svE3ERcONQLdUAml4WQ4zIkHCRGQ", "pcuoyZ34lLfNfnBpaWeneqbf8nIL3Tp1GoNiKtTn");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

    }
}
