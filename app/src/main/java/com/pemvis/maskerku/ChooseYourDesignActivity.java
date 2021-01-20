package com.pemvis.maskerku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseYourDesignActivity extends AppCompatActivity {
    Dialog dialogMasker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_design);

        Toolbar toolbar = findViewById(R.id.toolbar_choose_your_design);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_white_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        dialogMasker = new Dialog(this);
    }

    public void popupTerpopuler(View v) {
        dialogMasker.show();
        TextView x_button;
        Button button_ok;
        dialogMasker.setContentView(R.layout.custom_popup_masker);
        x_button = (TextView) dialogMasker.findViewById(R.id.x_button);
        button_ok = (Button) dialogMasker.findViewById(R.id.button_ok);
        ImageView imageMasker = (ImageView) dialogMasker.findViewById(R.id.popup_masker_image);
        switch (v.getId()) {
            case R.id.masker_1:
                imageMasker.setImageResource(R.drawable.masker_1);
                break;
            case R.id.masker_2:
                imageMasker.setImageResource(R.drawable.masker_2);
                break;
            case R.id.masker_3:
                imageMasker.setImageResource(R.drawable.masker_3);
                break;
            case R.id.masker_4:
                imageMasker.setImageResource(R.drawable.masker_4);
                break;
            case R.id.masker_5:
                imageMasker.setImageResource(R.drawable.masker_5);
                break;
            case R.id.masker_6:
                imageMasker.setImageResource(R.drawable.masker_6);
                break;
            case R.id.masker_7:
                imageMasker.setImageResource(R.drawable.masker_7);
                break;
            case R.id.masker_8:
                imageMasker.setImageResource(R.drawable.masker_8);
                break;
            case R.id.masker_9:
                imageMasker.setImageResource(R.drawable.masker_9);
                break;
            case R.id.masker_10:
                imageMasker.setImageResource(R.drawable.masker_10);
                break;
            case R.id.masker_11:
                imageMasker.setImageResource(R.drawable.masker_11);
                break;
            case R.id.masker_12:
                imageMasker.setImageResource(R.drawable.masker_12);
                break;
            case R.id.masker_13:
                imageMasker.setImageResource(R.drawable.masker_13);
                break;
            case R.id.masker_14:
                imageMasker.setImageResource(R.drawable.masker_14);
                break;
            case R.id.masker_15:
                imageMasker.setImageResource(R.drawable.masker_15);
                break;
            case R.id.masker_16:
                imageMasker.setImageResource(R.drawable.masker_16);
                break;
            case R.id.masker_17:
                imageMasker.setImageResource(R.drawable.masker_17);
                break;
        }
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
                startActivity(new Intent(ChooseYourDesignActivity.this, CartActivity.class));
            }
        });
    }
}