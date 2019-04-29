package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class InfoMealActivity extends AppCompatActivity {

    RecyclerView infoMealActivity;
    RecyclerView.Adapter infoMealAdapter;
    RecyclerView.LayoutManager infoMealLayoutManager;

    private ArrayList<item> infoMealArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomeal);
        infoMealActivity = (RecyclerView) findViewById(R.id.infomeal_recycler);

        DateFormat sdFormat = new SimpleDateFormat("MM-dd");
        Date nowDate = new Date();
        String today = sdFormat.format(nowDate);

        infoMealArrayList = new ArrayList<>();
        infoMealArrayList.add(new item(today,"0.3"));

        infoMealLayoutManager = new LinearLayoutManager(this);
        infoMealActivity.setLayoutManager(infoMealLayoutManager);

        infoMealAdapter = new InfoMealAdapter(infoMealArrayList);
        infoMealActivity.setAdapter(infoMealAdapter);
    }

    public class item {
        String mealdate;
        String mealcnt;

        public item(String mealdate, String mealcnt) {
            this.mealdate = mealdate;
            this.mealcnt = mealcnt;
        }

        public String getMealdate() {
            return mealdate;
        }

        public void setMealdate(String mealdate) {
            this.mealdate = mealdate;
        }

        public String getMealcnt() {
            return mealcnt;
        }

        public void setMealcnt(String mealcnt) {
            this.mealcnt = mealcnt;
        }

    }
}
