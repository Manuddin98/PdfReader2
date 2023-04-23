package com.example.pdfreader;

import static com.example.pdfreader.R.id;
import static com.example.pdfreader.R.layout;

import android.net.Uri;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;


@SuppressWarnings("MoveFieldAssignmentToInitializer")
public class PdfActivity extends AppCompatActivity {
    String filePath="";






    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_pdf);
        pdfView=findViewById(R.id.T);

        filePath=getIntent().getStringExtra("path");
        File file=new File(filePath);
        Uri path=Uri.fromFile(file);
        pdfView.fromUri(path).load();


        
    }
}