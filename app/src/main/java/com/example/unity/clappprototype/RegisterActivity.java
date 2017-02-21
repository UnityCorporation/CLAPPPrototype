package com.example.unity.clappprototype;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class RegisterActivity extends AppCompatActivity implements  View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText RFN = (EditText) findViewById(R.id.ETFirstName);
        final EditText RLN = (EditText) findViewById(R.id.ETLastName);
        final EditText RUN = (EditText) findViewById(R.id.ETUserName);
        final EditText RPW = (EditText) findViewById(R.id.Password);

        final Button RB = (Button) findViewById(R.id.RButton);

        RB.setOnClickListener(this);

    }


    private void NormalSignIn(){
        Intent MainPage = new Intent(RegisterActivity.this, HomeActivity.class);
        RegisterActivity.this.startActivity(MainPage);
    }


    @Override
    public void onClick(View v) {
        NormalSignIn();
    }
}
