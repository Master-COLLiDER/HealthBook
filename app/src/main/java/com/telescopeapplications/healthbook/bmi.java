package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bmi extends AppCompatActivity {
    EditText height, weight;
    Button next,calc;
    TextView result;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        height= findViewById(R.id.height);
        weight= findViewById(R.id.weight);

        next= findViewById(R.id.next);
        calc= findViewById(R.id.calc);
        result= findViewById(R.id.result);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennext();
            }
        });
    }

    public void calculateBMI() {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr) && weightStr != null && !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }
    }
        private void displayBMI(float bmi) {
            String bmiLabel = "";

            if (Float.compare(bmi, 15f) <= 0) {
                bmiLabel = "Underweight";
            } else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0) {
                bmiLabel = "Underweight";
            } else if (Float.compare(bmi,16f) > 0 && Float.compare(bmi, 18.5f) <= 0) {
                bmiLabel = "Underweight";
            } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 22.9f) <= 0) {
                bmiLabel = "Normal";
            } else if (Float.compare(bmi, 23f) > 0 && Float.compare(bmi, 24.9f) <= 0) {
                bmiLabel = "Overweight";
            } else if (Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 50f) <= 0) {
                bmiLabel = "Obese";
            } else {
                bmiLabel = "Obese";
            }

            bmiLabel = bmi + "\n" + bmiLabel;
            result.setText(bmiLabel);

            hideSoftKeyboard(getWindow().getDecorView().findViewById(android.R.id.content));
            calc.setVisibility(View.GONE);
            next.setVisibility(View.VISIBLE);
        }

    public void opennext(){
        Intent intent=new Intent(this, VNSelector.class);
        startActivity(intent);
    }

    public void hideSoftKeyboard(View view){
        InputMethodManager imm =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_short, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.actionshort_about:
                startActivity(new Intent(getApplicationContext(),AboutActivity.class));
                break;
            case R.id.actionshort_aboutd:
                startActivity(new Intent(getApplicationContext(), Copyright.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}