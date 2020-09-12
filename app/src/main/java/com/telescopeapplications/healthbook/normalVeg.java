package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class normalVeg extends AppCompatActivity {
     private Toolbar toolbar;
    PDFView pdfViewNormalVeg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_veg);
  toolbar = findViewById(R.id.toolbar15);
        setSupportActionBar(toolbar);
        pdfViewNormalVeg = findViewById(R.id.pdfViewNormalVeg);
        pdfViewNormalVeg.fromAsset("normalVeg.pdf").load();
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
