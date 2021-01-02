package com.pemvis.maskerku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void toRegister(View v){
        startActivity(new Intent(this, RegisterActivity.class));
    }
    public void buttonLogin(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
}
