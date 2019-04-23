package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddsnackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addsnack);

        final EditText addsnack_edittext_kind = findViewById(R.id.addsnack_edittext1);
        final EditText addsnack_edittext_amount = findViewById(R.id.addsnack_edittext2);
        Button addsnack_btn_submit = findViewById(R.id.addsnack_btn2);
        Button addsnack_btn_cancel = findViewById(R.id.addsnack_btn1);

        addsnack_btn_cancel.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddsnackActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "취소하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        addsnack_btn_submit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addsnack_edittext_kind.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "먹은 간식의 종류를 입력하세요", Toast.LENGTH_SHORT).show();
                } else if (addsnack_edittext_amount.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "먹은 간식의 양을 입력하세요", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "먹은 간식의 양이 " + addsnack_edittext_amount.getText().toString() + "만큼 증가했습니다.", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(AddsnackActivity.this, InfoSnackActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}