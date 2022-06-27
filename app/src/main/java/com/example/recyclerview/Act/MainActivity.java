package com.example.recyclerview.Act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Box;
import com.example.recyclerview.MyAdapter;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvNameList;
    ArrayList<Box> datalist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();
    }

    private void binding() {

        rcvNameList = findViewById(R.id.rcvNameList);

        ArrayList<String> name = new ArrayList<>();
        name.add("Nikhil");
        name.add("Bablu");
        name.add("Nikhil");
        name.add("Darshit");
        name.add("Nikhil");
        name.add("Sujal");
        name.add("Bablu");
        name.add("Sujal");
        name.add("Darshit");
        name.add("Bablu");


        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.i2);
        img.add(R.drawable.i3);
        img.add(R.drawable.i5);
        img.add(R.drawable.i4);
        img.add(R.drawable.i5);
        img.add(R.drawable.i2);
        img.add(R.drawable.i5);
        img.add(R.drawable.i2);
        img.add(R.drawable.i5);
        img.add(R.drawable.i5);



        for (int i=0; i<name.size(); i++)
        {
            Box b = new Box();
            b.setimgList(img.get(i));
            b.setstudentNameList(name.get(i));
            datalist.add(b);
        }

        MyAdapter adapter = new MyAdapter(datalist);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        rcvNameList.setLayoutManager(manager);
        rcvNameList.setAdapter(adapter);
    }
}