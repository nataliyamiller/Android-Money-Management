package com.epicodus.moneymanagement.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.epicodus.moneymanagement.R;


public class RegisterActivity extends AppCompatActivity {
    private EditText mUsernameField;
    private EditText mPasswordField;
    private EditText mEmailField;
    private Button mSignupButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mUsernameField = (EditText) findViewById(R.id.usernameField);
        mPasswordField = (EditText) findViewById(R.id.passwordField);
        mEmailField = (EditText) findViewById(R.id.emailField);
        mSignupButton = (Button) findViewById(R.id.signupButton);

//        mRegisterLabelButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = mUserNameEditText.getText().toString();
//                String password = mPasswordEditText.getText().toString();
//                String email = mEmailEditText.getText().toString();
//
//                User user = new User(username, password, email);
//                Intent intent = new Intent(RegisterActivity.this, MainUserActivity.class);
//                startActivity(intent);
//            }
//        });
   }

}
