package com.muveapp.muve_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button login = (Button)findViewById(R.id.signInButton);
    TextView forgotPassword = (TextView)findViewById(R.id.forgotPasswordTextView);
    TextView createAccount = (TextView)findViewById(R.id.createAccountTextView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /// TODO: 2/13/17 - Add the linked next class
//        forgotPassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(LoginActivity.this, nextClass.class);
//                startActivity(intent);
//            }
//        });

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }

    public void loginButton() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
