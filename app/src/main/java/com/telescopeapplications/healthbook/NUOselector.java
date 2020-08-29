package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class NUOselector extends AppCompatActivity {
    ImageButton normal, overweight, obese;
    String T;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n_u_o_selector);
        toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        T = getIntent().getStringExtra("type");


        normal = findViewById(R.id.normal);
        overweight = findViewById(R.id.overweight);
        obese = findViewById(R.id.obese);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                if(T.equals("Veg"))
                {

                        opennormalVeg();
                   // System.out.println("Collider: "+T);

                }
                else
                opennormal();
            }
        });

        overweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(T.equals("Veg"))
                {

                        openoverweightVeg();
                    // System.out.println("Collider: "+T);

                }
                else
                    openoverweight();
            }
        });

        obese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if(T.equals("Veg"))
                 {
                        openobeseVeg();
                    // System.out.println("Collider: "+T);

                }
                else
                openobese();
            }
        });
    }

    public void opennormal(){
        Intent intent=new Intent(this, underweight.class);
        startActivity(intent);
    }

    public void openoverweight(){
        Intent intent=new Intent(this, normal.class);
        startActivity(intent);
    }

    public void openobese(){
        Intent intent=new Intent(this, overweight.class);
        startActivity(intent);
    }

    public void opennormalVeg(){
        Intent intent=new Intent(this, underweightVeg.class);
        startActivity(intent);
    }

    public void openoverweightVeg(){
        Intent intent=new Intent(this, normalVeg.class);
        startActivity(intent);
    }

    public void openobeseVeg(){
        Intent intent=new Intent(this, overweightVeg.class);
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
