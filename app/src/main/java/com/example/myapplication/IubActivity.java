package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IubActivity extends AppCompatActivity {

    Button iub_url;
    TextView iub_des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iub);

        iub_url = findViewById(R.id.iub_url);
        iub_des = findViewById(R.id.iub_des);

        iub_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent url = new Intent(Intent.ACTION_VIEW);
                url.setData(Uri.parse("http://www.iub.edu.bd/"));
                startActivity(url);
            }
        });


    }
}