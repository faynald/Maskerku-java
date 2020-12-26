package com.pemvis.maskerku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toLogin(View v){
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
    public void toCreateYourMask(View v){
        startActivity(new Intent(MainActivity.this, create_your_mask.class));
    }
}
