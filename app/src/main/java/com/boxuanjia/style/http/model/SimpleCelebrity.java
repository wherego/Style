package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SimpleCelebrity {

    @SerializedName("id")
    @Expose
    private String id; // 影人条目id

    @SerializedName("name")
    @Expose
    private String name; // 中文名

    @SerializedName("alt")
    @Expose
    private String alt; // 影人条目URL

    @SerializedName("avatars")
    @Expose
    private Avatars avatars; // 影人头像

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Avatars getAvatars() {
        return avatars;
    }

    public void setAvatars(Avatars avatars) {
        this.avatars = avatars;
    }

}
