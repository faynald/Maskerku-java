package com.pemvis.maskerku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private long backPressedTime;
    private Toast backToast;
    private ImageView imageMasker;
    Dialog dialogMasker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        }

        dialogMasker = new Dialog(this);
    }
    public void toCreateYourMask(View v){
        startActivity(new Intent(MainActivity.this, CreateYourMaskActivity.class));
    }

    public void toChooseYourDesign(View v){
        startActivity(new Intent(this, ChooseYourDesignActivity.class));
    }

    public void toHome(MenuItem item){
        drawerLayout.closeDrawers();
    }

    public void toProfile(MenuItem item){
        drawerLayout.closeDrawers();
        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
    }

    public void toCart(MenuItem item){
        drawerLayout.closeDrawers();
        startActivity(new Intent(this, CartActivity.class));
    }

    public void toTestimoni(MenuItem item){
        drawerLayout.closeDrawers();
        startActivity(new Intent(MainActivity.this, TestimoniActivity.class));
    }

    public void toSetting(MenuItem item){
        drawerLayout.closeDrawers();
        startActivity(new Intent(this, SettingActivity.class));
    }

    public void toAboutus(MenuItem item){
        drawerLayout.closeDrawers();
        startActivity(new Intent(this, AboutusActivity.class));
    }

    public void toLogin(MenuItem item) {
        drawerLayout.closeDrawers();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void popupTerpopuler1(View v){
        dialogMasker.show();
        TextView x_button;
        Button button_ok;
        dialogMasker.setContentView(R.layout.custom_popup_masker);
        x_button = (TextView) dialogMasker.findViewById(R.id.x_button);
        button_ok = (Button) dialogMasker.findViewById(R.id.button_ok);
        imageMasker = (ImageView) findViewById(R.id.popup_masker_image);
        // error: imageMasker.setImageResource(R.drawable.terpopuler_1);
        x_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogMasker.dismiss();
            }
        });
        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogMasker.dismiss();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        //moveTaskToBack(true);
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Tekan kembali lagi untuk dissapear", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}
