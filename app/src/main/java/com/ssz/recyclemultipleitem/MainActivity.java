package com.ssz.recyclemultipleitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ssz.recyclemultipleitem.enty.MultipleItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MultipleItem>list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniData();
        iniView();
    }

    private void iniData() {
        for(int i=0;i<15;i++){
            list.add(new MultipleItem(MultipleItem.TEXT,"text"+i));
            list.add(new MultipleItem(MultipleItem.IMAGE_TEXT,"image"+i));
        }
    }

    private void iniView() {
        RecyclerView recycleView = (RecyclerView) findViewById(R.id.recycle_view);
        MultipleItemAdapter multipleItemAdapter = new MultipleItemAdapter(this, list);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        recycleView.setLayoutManager(lm);
        recycleView.setAdapter(multipleItemAdapter);

    }
}
