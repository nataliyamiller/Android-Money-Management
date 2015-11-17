package com.epicodus.moneymanagement.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.epicodus.moneymanagement.R;
import com.epicodus.moneymanagement.models.User;

public class RegisterActivity extends AppCompatActivity {
    private EditText mUserNameEditText;
    private EditText mPasswordEditText;
    private EditText mEmailEditText;
    private Button mRegisterLabelButton;

    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mUserNameEditText = (EditText) findViewById(R.id.userNameEditText);
        mPasswordEditText = (EditText) findViewById(R.id.passwordEditText);
        mEmailEditText = (EditText) findViewById(R.id.emailEditText);
        mRegisterLabelButton = (Button) findViewById(R.id.registerLabelButton);

        mRegisterLabelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUserNameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();
                String email = mEmailEditText.getText().toString();

                User user = new User(username, password, email);
                Intent intent = new Intent(RegisterActivity.this, MainUserActivity.class);
                startActivity(intent);
            }
        });
    }

}
