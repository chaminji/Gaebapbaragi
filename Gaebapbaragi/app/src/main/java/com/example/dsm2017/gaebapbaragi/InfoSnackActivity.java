package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InfoSnackActivity extends AppCompatActivity {

    RecyclerView infoSnackActivity;
    RecyclerView.Adapter infoSnackAdapter;
    RecyclerView.LayoutManager infoSnackLayoutManager;

    private ArrayList<item> infoSnackArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infosnack);
        infoSnackActivity = findViewById(R.id.infosnack_recycler);

        infoSnackArrayList = new ArrayList<>();
        infoSnackArrayList.add(new item("껌", "04-25", "2"));

        infoSnackLayoutManager = new LinearLayoutManager(this);
        infoSnackActivity.setLayoutManager(infoSnackLayoutManager);

        infoSnackAdapter = new InfoSnackAdapter(infoSnackArrayList);
        infoSnackActivity.setAdapter(infoSnackAdapter);
    }

    public class item {
        String snackname;
        String snackdate;
        String snackcnt;

        public item(String snackname, String snackdate, String snackcnt) {
            this.snackname = snackname;
            this.snackdate = snackdate;
            this.snackcnt = snackcnt;
        }

        public String getSnackname() {
            return snackname;
        }

        public String getSnackdate() {
            return snackdate;
        }

        public String getSnackcnt() {
            return snackcnt;
        }

        public void setSnackname(String snackname) {
            this.snackname = snackname;
        }

        public void setSnackdate(String snackdate) {
            this.snackdate = snackdate;
        }

        public void setSnackcnt(String snackcnt) {
            this.snackcnt = snackcnt;
        }
    }
}