package com.example.networking.model.channels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Channels {

    @SerializedName("data")
    @Expose
    private List<Information> data = null;

    public List<Information> getData() {
        return data;
    }

    public void setData(List<Information> data) {
        this.data = data;
    }

}
