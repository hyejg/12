package com.example.a12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        PersonAdapter adapter=new PersonAdapter();

        adapter.addItem(new Person("이혜정", "010-0000-0000"));
        adapter.addItem(new Person("김혜정", "010-0001-0001"));
        adapter.addItem(new Person("정혜정", "010-0002-0002"));
        
        recyclerView.setAdapter(adapter);
    }
}