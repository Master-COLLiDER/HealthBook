package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class obeseVeg extends AppCompatActivity {
    PDFView pdfViewObeseVeg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obese_veg);


        pdfViewObeseVeg = findViewById(R.id.pdfViewObeseVeg);
        pdfViewObeseVeg.fromAsset("obeseVeg.pdf").load();
    }
}
