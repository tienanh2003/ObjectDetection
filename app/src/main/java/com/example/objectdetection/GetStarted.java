package com.example.objectdetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class GetStarted extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(v -> {
            Intent intent = new Intent(GetStarted.this, MainActivity.class);
            startActivity(intent);
        });
    }
}