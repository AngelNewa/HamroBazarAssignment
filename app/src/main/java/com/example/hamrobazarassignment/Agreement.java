package com.example.hamrobazarassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.hamrobazarassignment.agreement.AdPostingRule;
import com.example.hamrobazarassignment.agreement.Safety;
import com.example.hamrobazarassignment.agreement.Terms;

public class Agreement extends AppCompatActivity {

    CheckBox chkTerms, chkSafety, chkAd;
    Button btnAgreed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);

        chkTerms = findViewById(R.id.chkTerms);
        chkSafety = findViewById(R.id.chkSafety);
        chkAd = findViewById(R.id.chkAd);
        btnAgreed = findViewById(R.id.btnAgreed);


        chkTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Agreement.this, Terms.class);
                startActivity(intent);
                chkTerms.setChecked(true);
                chkTerms.setEnabled(false);

                //v.setOnClickListener(null);
            }
        });

        chkSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Agreement.this, Safety.class);
                startActivity(intent);
                chkSafety.setChecked(true);
                chkSafety.setEnabled(false);
            }
        });

        chkAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Agreement.this, AdPostingRule.class);
                startActivity(intent);
                chkAd.setChecked(true);
                chkAd.setEnabled(false);
            }
        });

        btnAgreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Agreement.this, SplashActivity.class);
                startActivity(intent);
            }
        });

    }
}