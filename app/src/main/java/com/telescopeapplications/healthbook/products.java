package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class products extends AppCompatActivity {
    private Button button;
    CheckBox sdkq1,sdkq2,sdkq3,sdkq4,sdkq5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);
        sdkq1=findViewById(R.id.sdq1);
        sdkq2=findViewById(R.id.sdq2);
        sdkq3=findViewById(R.id.sdq3);
        sdkq4=findViewById(R.id.sdq4);
        sdkq5=findViewById(R.id.sdq5);

        button=findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openday();
            }
        });
    }
    public void openday(){
        Intent intent=new Intent(this, day.class);
        startActivity(intent);
    }
}
