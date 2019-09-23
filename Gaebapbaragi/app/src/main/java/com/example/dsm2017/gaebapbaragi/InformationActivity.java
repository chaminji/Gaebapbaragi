package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class InformationActivity extends AppCompatActivity {

    RecyclerView information_recycler;
    RecyclerView.Adapter informationAdapter;
    RecyclerView.LayoutManager informationLayoutManager;

    private ArrayList<infoItem> informationArrayList;

    String title1 = "강아지가 삼켜버릴 수 있는 위험한 물건 9가지";
    String title2 = "강아지 발바닥 털 자주 잘라주어야 하는 이유";
    String content1 = "개들이 먹을 수 있는 유익한 음식들을 제외한 음식이나 물건들은, 뭐든지 입으로 넣기 바쁜 우리 댕댕이들에게 언제든지 경고음이 켜질 수 있음을 인지해야 한다.\n\n" +
            "머리끈 – 주인의 냄새가 좋아요\n\n" +
            "반려인들은 알고 있다시피, 개들은 자신의 보호자의 체취가 묻은 물건들을 가까이 하고 싶어하고, 그 냄새를 통해 심리적 안정을 취하고는 한다.\n" +
            "물론, 개들이 머리끈을 1~2개 먹는 것으로 엄청난 결과를 초래할 가능성은 크지 않다. 하지만 그 개수가 증가해서 내장에 결릴 경우, 구토, 복통 그리고 식욕감소로 이어질 수 있다.\n\n" +
            "스푼, 나이프, 포크 등 뾰족한 주방도구\n\n" +
            "개들은 포크나 스푼 등을 입으로 가져가는 경향이 있는데, 후각을 자극하는 음식 냄새가 베어있기 때문이다.\n" +
            "게다가 개의 후각은 인간보다 훨씬 뛰어나기 때문에 맛있는 음식의 냄새가 베어 있는 주방용 도구들을 거리낌 없이 먹을 가능성이 크다.\n" +
            "포크나 나이프와 같이 끝이 날카롭고 뾰족한 것을 삼키는 경우, 몸 속을 통과하는 과정에서 장기에 치명적인 손상을 입을 수 있다. 따라서, 애초에 개의 손발이 닿지 않도록 철저한 주의를 기울여야 한다. \n\n" +
            "신발\n\n" +
            "만약 반려견이 운동화 등을 씹다가 큰 덩어리로 뜯겨진 조각을 먹게 될 경우, 치료를 위해 신발 가격보다 더 많은 비용을 지불할 수 있다.\n" +
            "특히, 섭취한 신발 조각으로 장폐색이 오게 되면 설사 및 구토 증세가 나타나고 수술을 통해 제거를 해야한다. 따라서, 신발은 신발장 안에서만 보관하고, 신발 대신 개들에게 안전한 씹을 것을 주어야 한다.\n\n" +
            "귀에 사용한 면봉\n\n" +
            "귀지를 닦는 등 귀에 사용한 면봉에 묻는 지질이나 단백질 성분은 개의 후각을 자극한다고 한다.\n" +
            "특히, 이 면봉을 삼키는 경우에는 위장을 자극하여 설사나 구토 등을 유발할 수 있으므로 평소 쓰고 난 면봉을 처리하는 것에 주의를 기울여야 한다.\n\n" +
            "동전\n\n" +
            "동전 또한 개들이 쉽게 먹을 우려가 있는 물건 중 하나다.\n" +
            "특히, 동전의 구리나 아연 등의 성분이 자칫 독성을 유발하여 빈혈로 이어질 수도 있으므로 동전을 바닥에 두거나 반려견이 닿을 수 없는 곳에 보관해야 한다.\n";
    String content2 = "털 때문에 미끄러져 슬개골, 관절에 무리가기도 해\n\n" +
            "발바닥 털이 길면 털이 짧을 때보다 더 심하게 미끄러지거나 넘어질 수 있다. 특히, 미끄러운 지면에서 그렇다. 넘어지는 모습이 너무 귀엽기도 하다. 하지만, 반복되면 슬개골이나 관절에 무리가 간다.\n" +
            "특히나, 이리저리 뛰는 것을 좋아하는 어린 나이의 강아지라면 미끄러져도 아랑곳하지 않는다. 따라서, 더욱더 발바닥 털을 밀어주어야 한다.\n\n" +
            "털 길면 산책 시 이물질 붙어\n\n" +
            "미끄러운 곳 뿐만 아니라 산책을 나갈 때도 발바닥 털이 짧아야 한다. 털이 긴 경우, 실외에 있는 수많은 이물질들이 털에 달라붙는다. 특히나, 진드기가 기승을 부리는 계절에는 잔디밭 산책 시 긴 발바닥, 발가락 사이사이 털에 진드기가 잘 달라붙는다.\n" +
            "실외에는 먼지에서부터 유리조각까지 우리가 알 수 없는 다양한 이물질이 있다. 그리고, 이러한 이물질은 털이라는 긴 경단백질에 아주 잘 달라붙는다. 따라서, 강아지의 안전은 물론 이물질을 집으로 옮기게 하지 않기 위해 발바닥 털을 잘라주는 것이 중요하다.\n\n" +
            "여름에 특히 잘 밀어주세요\n\n" +
            "강아지는 사람과 달리 땀샘이 혀와 발바닥 뒷부분에만 있다. 그런데 무더운 여름날 발바닥 사이사이 털이 가득하다면? 체온조절이 어려울 것이다. 따라서, 여름에는 특히나 발바닥 털을 잘 밀어주어야 한다.\n\n" +
            "겨울에도 잊지마세요\n\n" +
            "여름뿐 아니라 겨울에도 신경을 써야 한다. 털에 눈과 제설제가 잘 붙기 때문이다.\n" +
            "겨울에는 도보에 제설제를 뿌리는데 발바닥 털이 길면 이 물질이 잘 붙는다. 제설제는 염화칼슘 성분으로, 차량까지도 부식시킬 수 있는 강력한 화학물질이다. 그리고, 산책 후 집에서 제대로 발을 제대로 씻기지 않으면 최악의 경우 강아지가 발바닥을 핥으면서 염화칼슘을 먹게 된다.\n" +
            "따라서, 겨울에는 특히나 발바닥 털을 자주 밀어주고 산책 후 발을 꼼꼼하게 씻겨야 한다.\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        information_recycler = findViewById(R.id.information_recycler);

        informationArrayList = new ArrayList<>();
        informationArrayList.add(new infoItem(title1, content1));
        informationArrayList.add(new infoItem(title2, content2));

        informationLayoutManager = new LinearLayoutManager(this);
        information_recycler.setLayoutManager(informationLayoutManager);

        informationAdapter = new InformationAdapter(informationArrayList);
        information_recycler.setAdapter(informationAdapter);

        information_recycler.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), information_recycler, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(getApplicationContext(), InformationViewActivity.class);
                if (position == 0) {
                    intent.putExtra("title", title1);
                    intent.putExtra("content", content1);
                } else {
                    intent.putExtra("title", title2);
                    intent.putExtra("content", content2);
                }
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }

    public class infoItem {
        String infotitle;
        String infocontent;

        public infoItem(String infotitle, String infocontent) {
            this.infotitle = infotitle;
            this.infocontent = infocontent;
        }

        public String getInfotitle() {
            return infotitle;
        }

        public void setInfotitle(String infotitle) {
            this.infotitle = infotitle;
        }

        public String getInfocontent() {
            return infocontent;
        }

        public void setInfocontent(String infocontent) {
            this.infocontent = infocontent;
        }
    }
}