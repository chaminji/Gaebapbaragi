package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class InformationActivity extends AppCompatActivity {

    RecyclerView informationActivity;
    RecyclerView.Adapter informationAdapter;
    RecyclerView.LayoutManager informationLayoutManager;

    private ArrayList<item> informationArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        informationActivity = findViewById(R.id.information_recycler);

        informationArrayList = new ArrayList<>();
        informationArrayList.add(new item("강아지가 편안함을 느끼는 공간", "우리의 반려견들을 보면 아이들이 집안의 특정 공간을 선호하여 그곳에서 자주 머무르고, 휴식을 취하는 모습을 알게 된다"));
        informationArrayList.add(new item("강아지가 삼켜버릴 수 있는 위험한 물건 9가지", "반려견을 키우다 보면 예상치 못한 혹은 예상을 뛰어넘는 반려견의 행동으로 인해 식은땀을 흘리거나 기겁을 하는 등 하루에도 몇 번씩 새가슴이 되어 심장을 쓸어내리는 일을 경험해본 적이 있을 것이다"));

        informationLayoutManager = new LinearLayoutManager(this);
        informationActivity.setLayoutManager(informationLayoutManager);

        informationAdapter = new InformationAdapter(informationArrayList);
        informationActivity.setAdapter(informationAdapter);
    }

    public class item {
        String infotitle;
        String infocontent;

        public item(String infotitle, String infocontent) {
            this.infotitle = infotitle;
            this.infocontent = infocontent;
        }

        public String getInfotitle() {
            return infotitle;
        }

        public String getInfocontent() { return infocontent; }
    }
}
