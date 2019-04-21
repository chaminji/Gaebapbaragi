package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AddpetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpet);

        EditText addpet_name = findViewById(R.id.addpet_name);
        EditText addpet_age = findViewById(R.id.addpet_age);
        EditText addpet_kind = findViewById(R.id.addpet_kind);
        RadioButton addpet_radio_male = findViewById(R.id.addpet_radio1);
        RadioButton addpet_radio_female = findViewById(R.id.addpet_radio2);
        Button addpet_btn = findViewById(R.id.addpet_btn);
        RadioGroup addpet_radio_group = findViewById(R.id.addpet_radio);

    }
}
