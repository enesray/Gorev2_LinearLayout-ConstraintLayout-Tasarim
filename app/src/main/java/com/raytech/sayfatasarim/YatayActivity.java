package com.raytech.sayfatasarim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YatayActivity extends AppCompatActivity {
Button btnYatay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yatay);
        btnYatay = findViewById(R.id.btnYatay);
        btnYatay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent git = new Intent(YatayActivity.this, MainActivity.class);
                startActivity(git);
            }
        });
    }
}