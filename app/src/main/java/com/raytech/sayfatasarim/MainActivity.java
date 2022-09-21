package com.raytech.sayfatasarim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button btnIleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIleri =findViewById(R.id.btnIleri);

        btnIleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent git = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(git);
            }
        });



    }
}