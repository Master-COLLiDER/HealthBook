package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class second extends AppCompatActivity {
    private ImageButton but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        but1=findViewById(R.id.imageButtona);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencereal();
            }
        });
    }
    public void opencereal(){
        Intent intent=new Intent(this, cereal.class);
        startActivity(intent);
    }
}
