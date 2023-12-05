package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UitsActivity extends AppCompatActivity {

    Button uits_url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uits);

        uits_url = findViewById(R.id.uits_url);


        uits_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent url = new Intent(Intent.ACTION_VIEW);
                url.setData(Uri.parse("https://uits.edu.bd/"));
                startActivity(url);
            }
        });
    }
}