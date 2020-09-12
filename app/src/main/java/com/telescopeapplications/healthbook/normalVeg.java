package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class normalVeg extends AppCompatActivity {
    PDFView pdfViewNormalVeg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_veg);

        pdfViewNormalVeg = findViewById(R.id.pdfViewNormalVeg);
        pdfViewNormalVeg.fromAsset("normalVeg.pdf").load();
    }
}
