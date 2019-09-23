package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AddpetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpet);

        final EditText addpet_name = findViewById(R.id.addpet_name);
        final EditText addpet_age = findViewById(R.id.addpet_age);
        final EditText addpet_kind = findViewById(R.id.addpet_kind);
        final RadioButton addpet_radio_male = findViewById(R.id.addpet_radio1);
        final RadioButton addpet_radio_female = findViewById(R.id.addpet_radio2);
        Button addpet_btn = findViewById(R.id.addpet_btn);
        final RadioGroup addpet_radio_group = findViewById(R.id.addpet_radio);

        addpet_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addpet_name.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "이름을 입력하세요", Toast.LENGTH_SHORT).show();
                } else if (addpet_age.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), addpet_name.getText().toString() + "의 나이를 입력하세요", Toast.LENGTH_SHORT).show();
                } else if (addpet_kind.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), addpet_name.getText().toString() + "의 종류를 입력하세요", Toast.LENGTH_SHORT).show();
                } else if (addpet_radio_male.isChecked() == false && addpet_radio_female.isChecked() == false) {
                    Toast.makeText(getApplicationContext(), "성별을 선택하세요", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(AddpetActivity.this, MainActivity.class);
                    Toast.makeText(getApplicationContext(), addpet_name.getText().toString() + "의 정보가 추가 되었습니다.", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });
    }
}
