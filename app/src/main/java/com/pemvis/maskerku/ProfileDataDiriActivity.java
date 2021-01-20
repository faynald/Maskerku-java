package com.pemvis.maskerku;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileDataDiriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_data_diri);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void klikEdit(View v){
        TextView textNama = findViewById(R.id.textview_nama_profile_data_diri);
        EditText editNama = findViewById(R.id.profile_edit_nama);
        ImageView imageEditNama = findViewById(R.id.image_edit_nama_profile_data_diri);
        TextView ubahNama = findViewById(R.id.profile_button_ubah_nama);

        TextView textTTL = findViewById(R.id.textview_tanggal_lahir_profile_data_diri);
        EditText editTTL = findViewById(R.id.profile_edit_ttl);
        switch (v.getId()) {
            case R.id.image_edit_nama_profile_data_diri:
                textNama.setVisibility(View.GONE);
                findViewById(R.id.profile_edit_nama).setVisibility(View.VISIBLE);
                findViewById(R.id.profile_button_ubah_nama).setVisibility(View.VISIBLE);
                break;
            case R.id.profile_button_ubah_nama:
                textNama.setText(editNama.getText().toString());
                textNama.setVisibility(View.VISIBLE);
                imageEditNama.setVisibility(View.VISIBLE);
                findViewById(R.id.profile_edit_nama).setVisibility(View.GONE);
                ubahNama.setVisibility(View.GONE);
                break;
            case R.id.image_edit_tanggal_lahir_profile_data_diri:
                findViewById(R.id.textview_tanggal_lahir_profile_data_diri).setVisibility(View.GONE);
                findViewById(R.id.profile_edit_ttl).setVisibility(View.VISIBLE);
                findViewById(R.id.profile_button_ubah_ttl).setVisibility(View.VISIBLE);
                break;
            case R.id.profile_button_ubah_ttl:
                textTTL.setText(editTTL.getText().toString());
                textTTL.setVisibility(View.VISIBLE);
                findViewById(R.id.image_edit_tanggal_lahir_profile_data_diri).setVisibility(View.VISIBLE);
                findViewById(R.id.profile_edit_ttl).setVisibility(View.GONE);
                findViewById(R.id.profile_button_ubah_ttl).setVisibility(View.GONE);
                break;
        }
    }
}