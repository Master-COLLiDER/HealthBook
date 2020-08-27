package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class veggies1 extends AppCompatActivity {
    private Button button;
    CheckBox cbsk1,cbsk2,cbsk3,cbsk4,cbsk5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veggies1);
        cbsk1=findViewById(R.id.cbs1);
        cbsk2=findViewById(R.id.cbs2);
        cbsk3=findViewById(R.id.cbs3);
        cbsk4=findViewById(R.id.cbs4);
        cbsk5=findViewById(R.id.cbs5);

        button=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openveggies2();
            }
        });
    }
    public void openveggies2(){
        Intent intent=new Intent(this, veggies2.class);
        startActivity(intent);
    }
}
