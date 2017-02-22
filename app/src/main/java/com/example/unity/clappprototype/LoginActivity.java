package com.example.unity.clappprototype;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
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

public class LoginActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, View.OnClickListener {

    private GoogleApiClient googleApI;
    private static final int Reg_Code = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

        final EditText LUN = (EditText) findViewById(R.id.ETLoginUserName);
        final EditText LPW = (EditText) findViewById(R.id.ETLoginPassword);
        final TextView RegLnk = (TextView) findViewById(R.id.TVRegister);
        final Button LB = (Button) findViewById(R.id.LButton);

        final SignInButton GSB = (SignInButton) findViewById(R.id.GoogleSingInButton);

        RegLnk.setOnClickListener(this);
        GSB.setOnClickListener(this);
        LB.setOnClickListener(this);

        GoogleSignInOptions signInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        googleApI = new GoogleApiClient.Builder(this).enableAutoManage(this, this).addApi(Auth.GOOGLE_SIGN_IN_API, signInOptions).build();

    }


    @Override
    public void onConnectionFailed (@NonNull ConnectionResult connectionResult){

    }

    private void GoogleSignIn(){
        Intent intent = Auth.GoogleSignInApi.getSignInIntent(googleApI);
        startActivityForResult(intent, Reg_Code);
    }

    private void NormalLogIn(){
        Intent MainPage = new Intent(LoginActivity.this, HomeActivity.class);
        MainPage.putExtra("IsLoggedIn", true);
        LoginActivity.this.startActivity(MainPage);
        finish();
    }

    private void RegisterHere(){
        Intent MainPage = new Intent(LoginActivity.this, RegisterActivity.class);
        LoginActivity.this.startActivity(MainPage);
    }


    private void HandleResult(GoogleSignInResult Result){
        if(Result.isSuccess()) {
            Intent MainPage = new Intent(LoginActivity.this, HomeActivity.class);
            MainPage.putExtra("IsLoggedIn", true);
            LoginActivity.this.startActivity(MainPage);
            finish();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == Reg_Code){

            GoogleSignInResult signIn = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            HandleResult(signIn);
        }
    }


    public void onClick(View v) {

        switch (v.getId()){

            case R.id.LButton:
                NormalLogIn();
                break;

            case R.id.GoogleSingInButton:
                GoogleSignIn();
                break;

            case R.id.TVRegister:
                RegisterHere();
                break;
        }
    }
}
