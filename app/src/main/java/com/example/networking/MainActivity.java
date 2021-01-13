package com.example.networking;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.networking.model.video.SearchData;
import com.example.networking.model.channels.Channels;

public class MainActivity extends AppCompatActivity implements ChannelsAdapter.OnClickListener {
    private RecyclerView channelsRecycler;
    private ChannelsAdapter channelsAdapter;
    private Channels data;
    private LinearLayoutManager layoutManager;
    final String TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        channelsRecycler = findViewById(R.id.list_channels);
        DataService dataService = new DataService();
        data = dataService.getChannels();
        try {
            SearchData searchData = dataService.getSearchChannels(29);
            Log.d(TAG, "getID" + searchData);
        } catch (Exception e) {
            Log.d(TAG, "Error: " + e.getMessage());
        }
        layoutManager = new LinearLayoutManager(this);
        channelsAdapter = new ChannelsAdapter(data, this);
        channelsRecycler.setLayoutManager(layoutManager);
        channelsRecycler.setAdapter(channelsAdapter);
    }

    @Override
    public void onClick(int position) {
        Log.d(TAG, "onClick: ");
        Intent intent = new Intent(this, SerchResultActivity.class);
        intent.putExtra("id", data.getData().get(position).getId());
        startActivity(intent);
    }
}