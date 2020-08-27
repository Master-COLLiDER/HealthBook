package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class day extends AppCompatActivity {
    private ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day);

        imgbutton=findViewById(R.id.days);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhabits();
            }
        });
    }
    public void openhabits(){
        Intent intent=new Intent(this, habits.class);
        startActivity(intent);
    }
}
