package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class AdddrugActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddrug);

        EditText adddrug_edittext_kind = findViewById(R.id.adddrug_edittext1);
        EditText adddrug_edittext_amount = findViewById(R.id.adddrug_edittext2);
        Button adddrug_btn_submit = findViewById(R.id.adddrug_btn2);
        Button adddrug_btn_cancel = findViewById(R.id.adddrug_btn1);

    }
}