package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.networking.model.video.SearchData;

public class SerchResultActivity extends AppCompatActivity {
    private RecyclerView searchResultRecycler;
    private SearchAdapter searchAdapter;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataService dataService = new DataService();
        SearchData searchData = dataService.getSearchChannels(29);
        setContentView(R.layout.activity_serch_result);
        searchResultRecycler = findViewById(R.id.searchResultLilt);
        layoutManager = new LinearLayoutManager(this);
        searchAdapter = new SearchAdapter(searchData);
        searchResultRecycler.setLayoutManager(layoutManager);
        searchResultRecycler.setAdapter(searchAdapter);
    }
}