package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SimpleReview {

    @SerializedName("id")
    @Expose
    private String id; // 影评id

    @SerializedName("title")
    @Expose
    private String title; // 影评名

    @SerializedName("alt")
    @Expose
    private String alt; // 影评url

    @SerializedName("subject_id")
    @Expose
    private String subjectId; // 条目id

    @SerializedName("author")
    @Expose
    private SimpleUser simpleUser; // 上传用户

    @SerializedName("rating")
    @Expose
    private Rating rating; // 影评评分

    @SerializedName("summary")
    @Expose
    private String summary; // 摘要，100字以内

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public SimpleUser getSimpleUser() {
        return simpleUser;
    }

    public void setSimpleUser(SimpleUser simpleUser) {
        this.simpleUser = simpleUser;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
