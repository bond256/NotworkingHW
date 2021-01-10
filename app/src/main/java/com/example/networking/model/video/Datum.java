package com.example.networking.model.video;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("isFavorite")
    @Expose
    private String isFavorite;
    @SerializedName("record_id")
    @Expose
    private String recordId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("isMobile")
    @Expose
    private String isMobile;
    @SerializedName("public")
    @Expose
    private Object _public;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("device")
    @Expose
    private String device;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("count_views")
    @Expose
    private String countViews;
    @SerializedName("count_likes")
    @Expose
    private String countLikes;
    @SerializedName("count_comments")
    @Expose
    private String countComments;
    @SerializedName("channel_id")
    @Expose
    private String channelId;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("isLiked")
    @Expose
    private String isLiked;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("user")
    @Expose
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public String getIsMobile() {
        return isMobile;
    }

    public void setIsMobile(String isMobile) {
        this.isMobile = isMobile;
    }

    public Object getPublic() {
        return _public;
    }

    public void setPublic(Object _public) {
        this._public = _public;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCountViews() {
        return countViews;
    }

    public void setCountViews(String countViews) {
        this.countViews = countViews;
    }

    public String getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(String countLikes) {
        this.countLikes = countLikes;
    }

    public String getCountComments() {
        return countComments;
    }

    public void setCountComments(String countComments) {
        this.countComments = countComments;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(String isLiked) {
        this.isLiked = isLiked;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
