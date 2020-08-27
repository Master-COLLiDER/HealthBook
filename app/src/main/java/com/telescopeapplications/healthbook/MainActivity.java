package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton BtnMove;
    private ImageButton BtnMove2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnMove = findViewById(R.id.imageButton1);
        BtnMove.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                movetosecond();
            }
        });

        BtnMove2 = findViewById(R.id.imageButton2);
        BtnMove2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                movetosecond();
            }
        });
    }

    private void movetosecond() {
        Intent intent = new Intent(MainActivity.this, second.class);
        startActivity(intent);
    }
}
