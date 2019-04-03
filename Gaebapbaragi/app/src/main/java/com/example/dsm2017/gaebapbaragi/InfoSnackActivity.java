package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

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
        infoSnackArrayList.add(new item("껌", "03/28", "2"));
        infoSnackArrayList.add(new item("저키", "03/28", "5"));
        infoSnackArrayList.add(new item("소세지", "03/29", "1"));
        infoSnackArrayList.add(new item("껌", "03/29", "1"));
        infoSnackArrayList.add(new item("저키", "03/30", "5"));
        infoSnackArrayList.add(new item("저키", "03/30", "5"));
        infoSnackArrayList.add(new item("껌", "03/31", "1"));

        infoSnackActivity.setHasFixedSize(true);

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
            return snackdate;
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