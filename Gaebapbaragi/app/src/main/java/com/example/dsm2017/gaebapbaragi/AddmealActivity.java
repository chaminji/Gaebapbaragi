package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddmealActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmeal);

        final EditText addmeal_edittext = findViewById(R.id.addmeal_edittext);
        Button addmeal_btn_submit = findViewById(R.id.addmeal_btn2);
        Button addmeal_btn_cancel = findViewById(R.id.addmeal_btn1);

        addmeal_btn_cancel.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddmealActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "취소하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        addmeal_btn_submit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (addmeal_edittext.getText().toString().length() == 0) {
                Toast.makeText(getApplicationContext(), "먹은 양을 입력하세요", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "먹은 식사의 양이 " + addmeal_edittext.getText().toString() + "만큼 증가했습니다.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(AddmealActivity.this, InfoMealActivity.class);
                startActivity(intent);
            }
            }
        });
    }
}