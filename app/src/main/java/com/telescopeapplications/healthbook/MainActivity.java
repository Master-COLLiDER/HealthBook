package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton BtnMove;
    private ImageButton BtnMove2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar9);
        setSupportActionBar(toolbar);
        BtnMove = findViewById(R.id.imageButton1);
        BtnMove.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                movetosecond();
            }
        });

        BtnMove2 = findViewById(R.id.imageButton2);
        BtnMove2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                movetosecond();
            }
        });
    }

    private void movetosecond() {
        Intent intent = new Intent(MainActivity.this, cereal.class);
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
