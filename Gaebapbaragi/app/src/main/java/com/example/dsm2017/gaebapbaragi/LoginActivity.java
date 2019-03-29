package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText editText_login_id = (EditText) findViewById(R.id.login_id);
        final EditText editText_login_submit = (EditText) findViewById(R.id.login_pw);
        Button btn_login_signup = (Button) findViewById(R.id.login_signup) ;
        Button btn_login_submit = (Button) findViewById(R.id.login_submit);

        btn_login_signup.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        }) ;

        btn_login_submit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText_login_id.getText().toString().length() == 0) {
                    Toast.makeText(LoginActivity.this, "ID를 입력하세요!", Toast.LENGTH_SHORT).show();
                } else if(editText_login_submit.getText().toString().length() == 0){
                    Toast.makeText(LoginActivity.this, "PASSWORD를 입력하세요!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "로그인 성공!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}