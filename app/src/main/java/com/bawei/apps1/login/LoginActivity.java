package com.bawei.apps1.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.bawei.apps1.R;

public class LoginActivity extends AppCompatActivity {

    EditText mLogin,mRegister;
    Button mLoginBut,mRegisterBut;
    String mLoginName,mRegisterPswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLogin = findViewById(R.id.login_name_et);
        mRegister = findViewById(R.id.login_pswd_et);
        mLoginBut= findViewById(R.id.login_lgbt);
        mRegisterBut= findViewById(R.id.login_rebt);
        mLoginName = mLogin.getText().toString();
        mRegisterPswd = mRegister.getText().toString();

    }
}
