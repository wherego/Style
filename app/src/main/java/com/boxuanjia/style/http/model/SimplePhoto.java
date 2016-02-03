package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SimplePhoto {

    @SerializedName("id")
    @Expose
    private String id; // 图片id

    @SerializedName("alt")
    @Expose
    private String alt; // 图片展示页url

    @SerializedName("icon")
    @Expose
    private String icon; // 图片地址，icon尺寸

    @SerializedName("image")
    @Expose
    private String image; // 图片地址，image尺寸

    @SerializedName("thumb")
    @Expose
    private String thumb; // 图片地址，thumb尺寸

    @SerializedName("cover")
    @Expose
    private String cover; // 图片地址，cover尺寸

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
