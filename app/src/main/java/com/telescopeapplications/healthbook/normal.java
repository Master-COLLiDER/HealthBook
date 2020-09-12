package com.telescopeapplications.healthbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class normal extends AppCompatActivity {
    PDFView pdfViewNormal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal);

        pdfViewNormal = findViewById(R.id.pdfViewNormal);
        pdfViewNormal.fromAsset("normal.pdf").load();
    }
}
