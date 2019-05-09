package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ArrayList<String> spinnerArrayList;
    ArrayAdapter<String> spinnerArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibtn_main_meal = findViewById(R.id.main_meal);
        ImageButton ibtn_main_snack = findViewById(R.id.main_snack);
        ImageButton ibtn_main_drug = findViewById(R.id.main_drug);
        ImageButton ibtn_main_others = findViewById(R.id.main_others);
        Spinner spinner = findViewById(R.id.main_spinner);

        Glide.with(this).load(this.getResources().getIdentifier("main_meal", "drawable", this.getPackageName())).into(ibtn_main_meal);
        Glide.with(this).load(this.getResources().getIdentifier("main_snack", "drawable", this.getPackageName())).into(ibtn_main_snack);
        Glide.with(this).load(this.getResources().getIdentifier("main_drug", "drawable", this.getPackageName())).into(ibtn_main_drug);
        Glide.with(this).load(this.getResources().getIdentifier("main_others", "drawable", this.getPackageName())).into(ibtn_main_others);

        ibtn_main_meal.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InfoMealActivity.class);
                startActivity(intent);
            }
        });

        ibtn_main_snack.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,InfoSnackActivity.class);
                startActivity(intent);
            }
        });

        ibtn_main_drug.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,InfoDrugActivity.class);
                startActivity(intent);
            }
        });

        ibtn_main_others.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        spinnerArrayList = new ArrayList<>();
        spinnerArrayList.add("댕댕이");
        spinnerArrayList.add("댕댕쓰");

        spinnerArrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinnerArrayList);

        spinner.setAdapter(spinnerArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),spinnerArrayList.get(i)+"가 선택되었습니다.",
                //        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }

    public void firstclick(View v){
        Intent intent = new Intent(MainActivity.this, AddmealActivity.class);
        startActivity(intent);
    }

    public void secondclick(View v){
        Intent intent = new Intent(MainActivity.this, AddsnackActivity.class);
        startActivity(intent);
    }

    public void thirdclick(View v){
        Intent intent = new Intent(MainActivity.this, AdddrugActivity.class);
        startActivity(intent);
    }

    public void forthclick(View v){
        Intent intent = new Intent(MainActivity.this, AddpetActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
}