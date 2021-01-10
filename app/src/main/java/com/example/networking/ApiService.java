package com.example.networking;

import com.example.networking.model.video.SearchData;
import com.example.networking.model.channels.Channels;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api/get-channels")
    Single<Channels> getChannels();

    @GET("api-mobile/search")
    Single<SearchData> getChannelsId(@Query("channel") int id);
}
