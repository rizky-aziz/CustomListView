package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hero> heroList;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);


        heroList.add(new Hero(R.drawable.spiderman, "Spiderman", "Avangers"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.ironman, "Iron Man", "Avangers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avangers"));
        heroList.add(new Hero(R.drawable.captainamerica, "Captein America", "Avangers"));
        heroList.add(new Hero(R.drawable.batman, "Batman", "Justice League"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);

        listView.setAdapter(adapter);
    }
}
