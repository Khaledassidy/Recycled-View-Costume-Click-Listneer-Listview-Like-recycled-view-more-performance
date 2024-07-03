package com.example.recycleview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class ActivityrunCostumeListview extends AppCompatActivity {

    ListView listView;
    CosutmeAddapterLikeRecycleViewInListView cosutmeAddapterLikeRecycleViewInListView;
    ArrayList<club> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityrun_costume_listview);
        listView=findViewById(R.id.listview);
        arrayList=new ArrayList<>();
        arrayList.add(new club("barca","5"));
        arrayList.add(new club("real","5"));
        arrayList.add(new club("ataltico","5"));
        arrayList.add(new club("bvb","5"));
        arrayList.add(new club("chealse","5"));
        arrayList.add(new club("arsenal","5"));
        arrayList.add(new club("bayern","5"));
        arrayList.add(new club("manchester","5"));
        arrayList.add(new club("hilal","5"));
        arrayList.add(new club("leo","5"));
        arrayList.add(new club("city","5"));
        arrayList.add(new club("paris","5"));
        arrayList.add(new club("spain","5"));
        arrayList.add(new club("liverpool","5"));
        arrayList.add(new club("h","5"));
        cosutmeAddapterLikeRecycleViewInListView=new CosutmeAddapterLikeRecycleViewInListView(this,arrayList,R.layout.view);
        listView.setAdapter(cosutmeAddapterLikeRecycleViewInListView);

    }
}