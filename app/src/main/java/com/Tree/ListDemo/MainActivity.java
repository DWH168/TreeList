package com.Tree.ListDemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TreeListAdapter treeListAdapter;
    List<TreeData> treeData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注意这里的顺序不能乱 必须按照层级关系添加

        treeData.add(new TreeData("父级1","1","0" ,0,true));
        treeData.add(new TreeData("子级1","2","1" ,1,true));
        treeData.add(new TreeData("子级的子级1","3","2" ,2,false));
        treeData.add(new TreeData("子级的子级2","4","0" ,2,false));
        treeData.add(new TreeData("父级2","5","0" ,0,true));
        treeData.add(new TreeData("子级2","6","0" ,1,false));
        treeData.add(new TreeData("子级3","7","0" ,1,false));


        recyclerView =findViewById(R.id.tree_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        treeListAdapter = new TreeListAdapter(MainActivity.this,treeData);
        recyclerView.setAdapter(treeListAdapter);
    }
}
