package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton BtnMove;
    private ImageButton BtnMove2;
    boolean doubleBackToExitPressedOnce = false;

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
        Intent intent = new Intent(MainActivity.this, bmi.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
