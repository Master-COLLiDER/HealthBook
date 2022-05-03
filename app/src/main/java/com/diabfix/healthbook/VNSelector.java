package com.diabfix.healthbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class VNSelector extends AppCompatActivity {
    private ImageButton BnVeg;
    private ImageButton BnNonVeg;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v_n_selector);

         toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
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
