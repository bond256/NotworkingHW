package com.example.networking;

import com.example.networking.model.video.SearchData;
import com.example.networking.model.channels.Channels;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataService {
    private Retrofit retrofit;
    private ApiService apiService;

    public DataService() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.screenlife.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public Channels getChannels() {
        return apiService.getChannels()
                .subscribeOn(Schedulers.io())
                .blockingGet();
    }

    public SearchData getSearchChannels(int id) {
        return apiService.getChannelsId(id)
                .subscribeOn(Schedulers.io())
                .blockingGet();
    }
}
