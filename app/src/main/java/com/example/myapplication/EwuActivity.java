package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EwuActivity extends AppCompatActivity {

    Button ewu_url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewu);

        ewu_url = findViewById(R.id.ewu_url);


        ewu_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent url = new Intent(Intent.ACTION_VIEW);
                url.setData(Uri.parse("https://www.ewubd.edu/"));
                startActivity(url);
            }
        });
    }
}