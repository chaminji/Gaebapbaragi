package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class AddmealActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmeal);

        EditText addmeal_edittext = findViewById(R.id.addmeal_edittext);
        Button addmeal_btn_submit = findViewById(R.id.addmeal_btn2);
        Button addmeal_btn_cancel = findViewById(R.id.addmeal_btn1);

    }
}