package com.diabfix.healthbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.pdfview.PDFView;

public class normalVeg extends AppCompatActivity {
     private Toolbar toolbar;
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_veg);
        toolbar = findViewById(R.id.toolbar15);
        setSupportActionBar(toolbar);
        pdfView = findViewById(R.id.normalVeg_pdf_view);
        pdfView.fromAsset("normalVeg.pdf").scale(100).show();
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
