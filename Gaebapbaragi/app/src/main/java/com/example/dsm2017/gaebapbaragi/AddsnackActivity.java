package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class AddsnackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addsnack);

        EditText addsnack_edittext_kind = findViewById(R.id.addsnack_edittext1);
        EditText addsnack_edittext_amount = findViewById(R.id.addsnack_edittext2);
        Button addsnack_btn_submit = findViewById(R.id.addsnack_btn2);
        Button addsnack_btn_cancel = findViewById(R.id.addsnack_btn1);

    }
}