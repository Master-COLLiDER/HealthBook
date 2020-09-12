package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.telescopeapplications.healthbook.R;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(2500);
                    Intent i = new Intent(SplashActivity.this,SlideActivity.class);
                    startActivity(i);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
