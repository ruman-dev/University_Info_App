package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class LauncherActivity extends AppCompatActivity {

    RelativeLayout nsuLayout,aiubLayout,uiuLayout,uitsLayout,ewuLayout,iubLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        nsuLayout = findViewById(R.id.nsuLayout);
        aiubLayout = findViewById(R.id.aiubLayout);
        uiuLayout = findViewById(R.id.uiuLayout);
        uitsLayout = findViewById(R.id.uitsLayout);
        ewuLayout = findViewById(R.id.ewuLayout);
        iubLayout = findViewById(R.id.iubLayout);

        nsuLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nsuIntent = new Intent(LauncherActivity.this,NsuActivity.class);
                startActivity(nsuIntent);
            }
        });

        aiubLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aiubIntent = new Intent(LauncherActivity.this,AiubActivity.class);
                startActivity(aiubIntent);
            }
        });

        uiuLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uiuIntent = new Intent(LauncherActivity.this,UiuActivity.class);
                startActivity(uiuIntent);
            }
        });

        uitsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uitsIntent = new Intent(LauncherActivity.this,UitsActivity.class);
                startActivity(uitsIntent);
            }
        });

        ewuLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ewuIntent = new Intent(LauncherActivity.this,EwuActivity.class);
                startActivity(ewuIntent);
            }
        });

        iubLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iubIntent = new Intent(LauncherActivity.this,IubActivity.class);
                startActivity(iubIntent);
            }
        });



    }
}