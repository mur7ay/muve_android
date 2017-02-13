package com.muveapp.muve_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    EditText clientName = (EditText)findViewById(R.id.clientName);
    EditText clientEmail = (EditText)findViewById(R.id.clientEmail);
    EditText clientPassword = (EditText)findViewById(R.id.clientPassword);
    Button createAccountButton = (Button)findViewById(R.id.createAccountButton);
    TextView haveAccount = (TextView)findViewById(R.id.alreadyHaveAnAccount);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        haveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
