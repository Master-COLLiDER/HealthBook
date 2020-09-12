package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class underweight extends AppCompatActivity {
    PDFView pdfViewUnder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.underweight);

        pdfViewUnder = findViewById(R.id.pdfViewUnder);
        pdfViewUnder.fromAsset("under.pdf").load();
    }
}
