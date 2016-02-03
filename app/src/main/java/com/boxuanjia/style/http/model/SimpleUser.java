package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SimpleUser {

    @SerializedName("id")
    @Expose
    private String id; // 用户id

    @SerializedName("name")
    @Expose
    private String name; // 用户名

    @SerializedName("uid")
    @Expose
    private String uid; // 用户唯一标识

    @SerializedName("signature")
    @Expose
    private String signature; // 用户签名

    @SerializedName("alt")
    @Expose
    private String alt; // 用户个人主页url

    @SerializedName("avatar")
    @Expose
    private String avatar; // 用户头像

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
