package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btn_signup_cancel = (Button) findViewById(R.id.signup_cancel);
        Button btn_signup_submit = (Button) findViewById(R.id.signup_submit);
        final EditText editText_signup_id = (EditText) findViewById(R.id.signup_id);
        final EditText editText_signup_pw = (EditText) findViewById(R.id.signup_pw);
        final EditText editText_signup_pw_check = (EditText) findViewById(R.id.signup_pw_check);

        btn_signup_cancel.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "회원가입을 취소하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_signup_submit.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(editText_signup_id.getText().toString().length() == 0) {
                    Toast.makeText(SignupActivity.this, "ID를 입력하세요!", Toast.LENGTH_SHORT).show();
                } else if(editText_signup_pw.getText().toString().length() == 0){
                    Toast.makeText(SignupActivity.this, "PASSWORD를 입력하세요!", Toast.LENGTH_SHORT).show();
                } else if(editText_signup_pw_check.getText().toString().length() == 0){
                    Toast.makeText(SignupActivity.this, "PASSWORD를 한 번 더 입력하세요!", Toast.LENGTH_SHORT).show();
                } else {
                    if (editText_signup_pw.getText().toString().length() == editText_signup_pw_check.getText().toString().length()) {
                        Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "회원가입 성공!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "PASSWORD가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
