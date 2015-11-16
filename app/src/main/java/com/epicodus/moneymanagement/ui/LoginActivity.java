package com.epicodus.moneymanagement.ui;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.epicodus.moneymanagement.R;
import com.epicodus.moneymanagement.models.SessionManager;
import com.epicodus.moneymanagement.models.User;

public class LoginActivity extends AppCompatActivity {

    Button mLoginButton;
    EditText mUsername, mPassword;
    TextView mRegisterLink;
    SessionManager mSessionManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsername = (EditText) findViewById(R.id.loginNameText);
        mPassword = (EditText) findViewById(R.id.loginPasswordText);
        mLoginButton = (Button) findViewById(R.id.loginButton);
        mRegisterLink = (TextView) findViewById(R.id.registerLink);
        mSessionManager = new SessionManager(this);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(null, null);
                mSessionManager.storeUserData(user);
                mSessionManager.setUserLoggedIn(true);
                }
        });

        mRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });


    }
}
