package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class about extends AppCompatActivity {
    private ImageButton btn;
    private ImageButton btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btn=findViewById(R.id.tipaa);
        btn2=findViewById(R.id.tipaa2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvalue();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvalue2();
            }
        });
    }

    public void openvalue(){
        Intent intent=new Intent(this, value2.class);
        startActivity(intent);
    }

    public void openvalue2(){
        Intent intent=new Intent(this, value.class);
        startActivity(intent);
    }
}
