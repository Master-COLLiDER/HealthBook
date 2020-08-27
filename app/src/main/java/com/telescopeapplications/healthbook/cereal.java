package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class cereal extends AppCompatActivity {
    private Button button;
    CheckBox sbsk1,sbsk2,sbsk3,sbsk4,sbsk5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cereal);

        sbsk1=findViewById(R.id.sbs1);
        sbsk2=findViewById(R.id.sbs2);
        sbsk3=findViewById(R.id.sbs3);
        sbsk4=findViewById(R.id.sbs4);
        sbsk5=findViewById(R.id.sbs5);

        button=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpulses();
            }
        });
    }
    public void openpulses(){
        Intent intent=new Intent(this, pulses.class);
        startActivity(intent);
    }
}
