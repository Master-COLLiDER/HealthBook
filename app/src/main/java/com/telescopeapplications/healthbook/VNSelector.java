package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VNSelector extends AppCompatActivity {
    private ImageButton BnVeg;
    private ImageButton BnNonVeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v_n_selector);
        BnVeg =findViewById(R.id.bnvnselectorveg);
        BnNonVeg =findViewById(R.id.bnvnselectornonveg);
        BnVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvalue();
            }
        });
        BnNonVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvalue2();
            }
        });
    }

    public void openvalue(){
        Intent intent=new Intent(this, NUOselector.class);
        intent.putExtra("type","Veg");
        startActivity(intent);
    }

    public void openvalue2(){
        Intent intent=new Intent(this, NUOselector.class);
        intent.putExtra("type","NonVeg");
        startActivity(intent);
    }
}
