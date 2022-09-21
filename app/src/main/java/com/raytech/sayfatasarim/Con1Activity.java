package com.raytech.sayfatasarim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Con1Activity extends AppCompatActivity {
 public  Button btnRay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con1);
        btnRay = findViewById(R.id.btnRay);
        btnRay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent git = new Intent(Con1Activity.this, Con2Activity.class);
                startActivity(git);
            }
        });
    }
}