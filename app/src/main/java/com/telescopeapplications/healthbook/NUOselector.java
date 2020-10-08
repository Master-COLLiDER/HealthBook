package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class NUOselector extends AppCompatActivity {
    Button underWeightBtn, normalBtn, obeseBtn;
    String T;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n_u_o_selector);
        toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        T = getIntent().getStringExtra("type");


        underWeightBtn = findViewById(R.id.normaltBtn);
        normalBtn = findViewById(R.id.overweightBtn);
        obeseBtn = findViewById(R.id.obeseBtn);

        underWeightBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                if(T.equals("Veg"))
                {

                        openUnderWeightVeg();
                   // System.out.println("Collider: "+T);

                }
                else
                openUnderWeight();
            }
        });

        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(T.equals("Veg"))
                {

                        openNormalVeg();
                    // System.out.println("Collider: "+T);

                }
                else
                    openNormal();
            }
        });

        obeseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if(T.equals("Veg"))
                 {
                        openObeseVeg();
                    // System.out.println("Collider: "+T);

                }
                else
                openObese();
            }
        });
    }

    public void openUnderWeight(){
        Intent intent=new Intent(this, underweight.class);
        startActivity(intent);
    }

    public void openNormal(){
        Intent intent=new Intent(this, normal.class);
        startActivity(intent);
    }

    public void openObese(){
        Intent intent=new Intent(this, com.telescopeapplications.healthbook.obese.class);
        startActivity(intent);
    }

    public void openUnderWeightVeg(){
        Intent intent=new Intent(this, underweightVeg.class);
        startActivity(intent);
    }

    public void openNormalVeg(){
        Intent intent=new Intent(this, normalVeg.class);
        startActivity(intent);
    }

    public void openObeseVeg(){
        Intent intent=new Intent(this, obeseVeg.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_bmi:
                startActivity(new Intent(getApplicationContext(),bmi.class));
                break;
            case R.id.action_about:
                startActivity(new Intent(getApplicationContext(),AboutActivity.class));
                break;
            case R.id.action_aboutd:
                startActivity(new Intent(getApplicationContext(), Copyright.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
