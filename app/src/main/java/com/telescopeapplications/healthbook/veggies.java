package com.telescopeapplications.healthbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class veggies extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veggies);


        toolbar = findViewById(R.id.toolbarVeggies);
        setSupportActionBar(toolbar);


        findViewById(R.id.veggiesNextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),bmi.class));
            }
        });
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