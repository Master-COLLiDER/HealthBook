package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NUOselector extends AppCompatActivity {
    ImageButton underweight, normal, overweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n_u_o_selector);

        underweight = findViewById(R.id.under);
        normal= findViewById(R.id.normala);
        overweight= findViewById(R.id.over);

        underweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openunder();
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennormal();
            }
        });

        overweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openover();
            }
        });
    }

    public void openunder(){
        Intent intent=new Intent(this, underweight.class);
        startActivity(intent);
    }

    public void opennormal(){
        Intent intent=new Intent(this, normal.class);
        startActivity(intent);
    }

    public void openover(){
        Intent intent=new Intent(this, overweight.class);
        startActivity(intent);
    }
}
