package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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


        height.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                showCalculate();
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
        weight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                showCalculate();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
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

        if (!"".equals(heightStr) && !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }
    }
        private void displayBMI(float bmi) {
            String bmiLabel = "Undefined";

            if (bmi >= 18.5f && bmi <= 24.9f ){
                bmiLabel = "Normal";
            }else if (bmi >= 25.0f && bmi <= 29.9f){
                bmiLabel = "OverWeight";
            }else if (bmi >= 30.0f){
                bmiLabel = "Obese";
            }

            bmiLabel = bmi + "\n" + bmiLabel;
            result.setText(bmiLabel);

            hideSoftKeyboard(getWindow().getDecorView().findViewById(android.R.id.content));

            calc.setVisibility(View.INVISIBLE);
            next.setVisibility(View.VISIBLE);
        }

        public void showCalculate(){
            calc.setVisibility(View.VISIBLE);
            next.setVisibility(View.INVISIBLE);
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