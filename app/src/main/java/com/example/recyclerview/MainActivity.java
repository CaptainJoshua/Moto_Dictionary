package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    private final ArrayList<String> wordsList = new ArrayList<>();
    private final ArrayList<String> detailList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        wordsList.add("Cebuano to Tagalog"); // Title
        wordsList.add("Buntag"); // 5 words
        wordsList.add("Udto");
        wordsList.add("Gabii");
        wordsList.add("Kaadlawon");
        wordsList.add("Pananglitan");
        wordsList.add("Tagalog to Cebuano"); // Title
        wordsList.add("Kaliwa"); // 5 words
        wordsList.add("Kanan");
        wordsList.add("Harap");
        wordsList.add("Likod");
        wordsList.add("Taas");
        wordsList.add("Ilocano to Tagalog"); // Title
        wordsList.add("Buok");
        wordsList.add("Ngiwat");
        wordsList.add("Tengnged");
        wordsList.add("Takiag");
        wordsList.add("Ima");
        wordsList.add("Tagalog to Ilocano"); // Title
        wordsList.add("Bewang");
        wordsList.add("Binti");
        wordsList.add("Tuhod");
        wordsList.add("Tiyan");
        wordsList.add("Balikat");
        wordsList.add("Hiligaynon to Tagalog"); // Title
        wordsList.add("Wala sila may may mahimo");
        wordsList.add("Abyan sang tinapay");
        wordsList.add("Bersyon");
        wordsList.add("Indi ko ini maubra tanan");
        wordsList.add("Giwasak ang tibuok nga dakbanwa sa kalayo");
        wordsList.add("Tagalog to Hiligaynon"); // Title
        wordsList.add("Pumunta");
        wordsList.add("Ngayon");
        wordsList.add("Bukas");
        wordsList.add("Kahapon");
        wordsList.add("Hayop");


        detailList.add("Translation"); // Title (should be empty)
        detailList.add("Tagalog: Umaga");
        detailList.add("Tagalog: Tanghali");
        detailList.add("Tagalog: Gabi");
        detailList.add("Tagalog: Madaling araw");
        detailList.add("Tagalog: Halimbawa");
        detailList.add("Translation"); // Title (empty)
        detailList.add("Cebuano: Sa wala");
        detailList.add("Cebuano: Husto");
        detailList.add("Cebuano: Atubangan");
        detailList.add("Cebuano: Balik");
        detailList.add("Cebuano: Gitas-on");
        detailList.add("Translation"); // Title (empty)
        detailList.add("Tagalog: Buhok");
        detailList.add("Tagalog: Bibig");
        detailList.add("Tagalog: Leeg");
        detailList.add("Tagalog: Braso");
        detailList.add("Tagalog: Kamay");
        detailList.add("Translation"); // Title (empty)
        detailList.add("Ilocano: Siket");
        detailList.add("Ilocano: Saka");
        detailList.add("Ilocano: Tumeng");
        detailList.add("Ilocano: Buksit");
        detailList.add("Ilocano: Abaga");
        detailList.add("Translation"); // Title (empty)
        detailList.add("Tagalog: Trabaho");
        detailList.add("Tagalog: Sahod");
        detailList.add("Tagalog: Lupa");
        detailList.add("Tagalog: Dagat");
        detailList.add("Tagalog: Bundok");
        detailList.add("Translation"); // Title (empty)
        detailList.add("Hiligaynon: Wala ngalan");
        detailList.add("Hiligaynon: Indi ko kaya subong sini nga obra");
        detailList.add("Hiligaynon: Petsa sing Paghimo");
        detailList.add("Hiligaynon: Talawagon");
        detailList.add("Hiligaynon: Ang lalaki nagkaon sang tinapay");


        adapter = new RecyclerAdapter(wordsList, detailList, MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
}