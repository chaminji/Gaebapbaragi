package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

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

        infoMealArrayList = new ArrayList<>();
        infoMealArrayList.add(new item("03/28","0.3"));
        infoMealArrayList.add(new item("03/28","0.5"));
        infoMealArrayList.add(new item("03/29","0.5"));
        infoMealArrayList.add(new item("03/30","1.0"));
        infoMealArrayList.add(new item("03/31","0.3"));
        infoMealArrayList.add(new item("03/31","0.7"));

//        infoMealActivity.setHasFixedSize(true);

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

        public String getMealcnt() {
            return mealcnt;
        }
    }
}
