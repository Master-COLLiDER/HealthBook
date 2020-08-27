package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class habits extends AppCompatActivity {
    private ImageButton imgbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.habits);
        imgbutton2=findViewById(R.id.habits);
        imgbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbmi();
            }
        });
    }
    public void openbmi(){
        Intent intent=new Intent(this, bmi.class);
        startActivity(intent);
    }
}
