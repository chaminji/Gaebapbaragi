package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class InformationViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationview);

        Intent intent = getIntent();

        TextView view_title = findViewById(R.id.viewinformation_title);
        TextView view_content = findViewById(R.id.viewinformation_content);

        view_title.setText(intent.getStringExtra("title"));
        view_content.setText(intent.getStringExtra("content"));
    }
}