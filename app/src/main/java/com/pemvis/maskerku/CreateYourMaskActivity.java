package com.pemvis.maskerku;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateYourMaskActivity extends AppCompatActivity {
    Dialog dialogMaskerTerms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_your_mask);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        dialogMaskerTerms = new Dialog(this);
    }
    public void ShowPopup(View v) {
        TextView txtclose;
        Button buttonMengerti;
        dialogMaskerTerms.setContentView(R.layout.custom_popup_terms);
        txtclose =(TextView) dialogMaskerTerms.findViewById(R.id.txtclose);
        buttonMengerti = (Button) dialogMaskerTerms.findViewById(R.id.buttonMengerti);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogMaskerTerms.dismiss();
            }
        });
        dialogMaskerTerms.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogMaskerTerms.show();
    }
}