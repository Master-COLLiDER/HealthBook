package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class veggies3 extends AppCompatActivity {
    private Button button;
    CheckBox sdk1,sdk2,sdk3,sdk4,sdk5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veggies3);
        sdk1=findViewById(R.id.sd1);
        sdk2=findViewById(R.id.sd2);
        sdk3=findViewById(R.id.sd3);
        sdk4=findViewById(R.id.sd4);
        sdk5=findViewById(R.id.sd5);

        button=findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfruits();
            }
        });
    }
    public void openfruits(){
        Intent intent=new Intent(this, fruits.class);
        startActivity(intent);
    }
}
