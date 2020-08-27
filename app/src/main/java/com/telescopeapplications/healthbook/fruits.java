package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class fruits extends AppCompatActivity {
    private Button button;
    CheckBox sdkr1,sdkr2,sdkr3,sdkr4,sdkr5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);
        sdkr1=findViewById(R.id.sdr1);
        sdkr2=findViewById(R.id.sdr2);
        sdkr3=findViewById(R.id.sdr3);
        sdkr4=findViewById(R.id.sdr4);
        sdkr5=findViewById(R.id.sdr5);

        button=findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openproducts();
            }
        });
    }
    public void openproducts(){
        Intent intent=new Intent(this, products.class);
        startActivity(intent);
    }
}
