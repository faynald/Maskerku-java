package com.pemvis.maskerku;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class SettingActivity extends AppCompatActivity {
    SwitchCompat switchCompat1;
    SwitchCompat switchCompat2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        switchCompat1 = findViewById(R.id.switch1_setting);
        SharedPreferences sharedPreferences1 = getSharedPreferences("save1",MODE_PRIVATE);
        switchCompat1.setChecked(sharedPreferences1.getBoolean("value",true));
        switchCompat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat1.isChecked()){
                    SharedPreferences.Editor editor1 = getSharedPreferences("save1",MODE_PRIVATE).edit();
                    editor1.putBoolean("value",true);
                    editor1.apply();
                    switchCompat1.setChecked(true);
                }else{
                    SharedPreferences.Editor editor1 = getSharedPreferences("save1",MODE_PRIVATE).edit();
                    editor1.putBoolean("value",false);
                    editor1.apply();
                    switchCompat1.setChecked(false);
                }
            }
        });

        switchCompat2 = findViewById(R.id.switch2_setting);
        SharedPreferences sharedPreferences2 = getSharedPreferences("save2",MODE_PRIVATE);
        switchCompat2.setChecked(sharedPreferences2.getBoolean("value",true));
        switchCompat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat2.isChecked()){
                    SharedPreferences.Editor editor2 = getSharedPreferences("save2",MODE_PRIVATE).edit();
                    editor2.putBoolean("value",true);
                    editor2.apply();
                    switchCompat2.setChecked(true);
                }else{
                    SharedPreferences.Editor editor2 = getSharedPreferences("save2",MODE_PRIVATE).edit();
                    editor2.putBoolean("value",false);
                    editor2.apply();
                    switchCompat2.setChecked(false);
                }
            }
        });

    }
}