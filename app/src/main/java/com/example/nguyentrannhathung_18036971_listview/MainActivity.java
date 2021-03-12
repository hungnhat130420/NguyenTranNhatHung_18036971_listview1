package com.example.nguyentrannhathung_18036971_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGood;
    CustomGoodAdapter adt;
    ArrayList<Good> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGood = findViewById(R.id.lvGood);
        arrayList = new ArrayList<>();
        arrayList.add(new Good("Google","$80",R.drawable.ic_launcher_background));
        arrayList.add(new Good("Mỉcrosoft","$45",R.drawable.ic_launcher_background));
        arrayList.add(new Good("Apple","$30",R.drawable.ic_launcher_background));
        arrayList.add(new Good("Amazon","$75",R.drawable.ic_launcher_background));

        adt = new CustomGoodAdapter(this,R.layout.items_listview,arrayList);
        lvGood.setAdapter(adt);
    }
}