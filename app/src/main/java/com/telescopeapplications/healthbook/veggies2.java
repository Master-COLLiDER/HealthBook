package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class veggies2 extends AppCompatActivity {
    private Button button;
    CheckBox sk1,sk2,sk3,sk4,sk5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veggies2);
        sk1=findViewById(R.id.s1);
        sk2=findViewById(R.id.s2);
        sk3=findViewById(R.id.s3);
        sk4=findViewById(R.id.s4);
        sk5=findViewById(R.id.s5);

        button=findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openveggies3();
            }
        });
    }
    public void openveggies3(){
        Intent intent=new Intent(this, veggies3.class);
        startActivity(intent);
    }
}
