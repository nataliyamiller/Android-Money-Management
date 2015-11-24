package com.epicodus.moneymanagement.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.moneymanagement.R;


public class MainActivity extends AppCompatActivity {

    private Button mLoginButton;
    private Button mRegisterButton;
    private Button mMoreInfoButton;
//    SessionManager mSessionManager;
    Button mLogoutButton;


//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        if (authenticateUser() == true) {
//            displayUserDetails();
//
//        }
//    }

//    private boolean authenticateUser() {
//        return mSessionManager.getUserLoggedIn();
//    }

//    private void displayUserDetails() {
//        User user = mSessionManager.getLoggedInUser();
//        mUsername.setText(user.getUsername());
//        mPassword.setText(user.getPassword());
//        mEmail.setText(user.getEmail());
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginButton = (Button) findViewById(R.id.loginButton);
        mRegisterButton = (Button) findViewById(R.id.registerButton);
        mMoreInfoButton = (Button) findViewById(R.id.moreInfoButton);
//        mLogoutButton = (Button) findViewById(R.id.logoutButton);
//        mSessionManager = new SessionManager(this);

        mMoreInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });



//        mLogoutButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mSessionManager.clearUserData();
//                mSessionManager.setUserLoggedIn(false);
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//            }
//        });
    }


}
