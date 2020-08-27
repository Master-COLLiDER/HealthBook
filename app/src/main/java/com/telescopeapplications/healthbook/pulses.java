package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class pulses extends AppCompatActivity {
    private Button button;
    CheckBox sbskk1,sbskk2,sbskk3,sbskk4,sbskk5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pulses);
        sbskk1=findViewById(R.id.sbss1);
        sbskk2=findViewById(R.id.sbss2);
        sbskk3=findViewById(R.id.sbss3);
        sbskk4=findViewById(R.id.sbss4);
        sbskk5=findViewById(R.id.sbss5);

        button=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openveggies1();
            }
        });
    }
    public void openveggies1(){
        Intent intent=new Intent(this, veggies1.class);
        startActivity(intent);
    }
}
