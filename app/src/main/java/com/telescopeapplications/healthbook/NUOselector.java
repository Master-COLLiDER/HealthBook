package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NUOselector extends AppCompatActivity {
    ImageButton normal, overweight, obese;
    String T;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n_u_o_selector);

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

                        openoverweight();
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
                        openobese();
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


}
