package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdddrugActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddrug);

        final EditText adddrug_edittext_kind = findViewById(R.id.adddrug_edittext1);
        final EditText adddrug_edittext_date = findViewById(R.id.adddrug_edittext2);
        Button adddrug_btn_submit = findViewById(R.id.adddrug_btn2);
        Button adddrug_btn_cancel = findViewById(R.id.adddrug_btn1);

        adddrug_btn_cancel.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdddrugActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "취소하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        adddrug_btn_submit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (adddrug_edittext_kind.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "먹은 약의 종류를 입력하세요", Toast.LENGTH_SHORT).show();
                } else if(adddrug_edittext_date.getText().toString().length() == 0){
                    Toast.makeText(getApplicationContext(), "약을 먹은 날짜를 입력하세요", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "약을 먹은 날짜는 " + adddrug_edittext_date.getText().toString() + "입니다.", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(AdddrugActivity.this, InfoDrugActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}