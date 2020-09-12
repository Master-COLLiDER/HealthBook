package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class underweightVeg extends AppCompatActivity {
    PDFView pdfViewUnderVeg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.underweight_veg);

        pdfViewUnderVeg = findViewById(R.id.pdfViewUnderVeg);
        pdfViewUnderVeg.fromAsset("underVeg.pdf").load();
    }
}
