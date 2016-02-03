package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 短评
 */
public class Comment {

    @SerializedName("id")
    @Expose
    private String id; // 图片id

    @SerializedName("created_at")
    @Expose
    private String createdAt; // 发布日期

    @SerializedName("subject_id")
    @Expose
    private String subjectId; // 条目id

    @SerializedName("author")
    @Expose
    private SimpleUser simpleUser; // 上传用户

    @SerializedName("content")
    @Expose
    private String content; // 短评内容,140字以内

    @SerializedName("rating")
    @Expose
    private Rating rating; // 短评评分

    @SerializedName("useful_count")
    @Expose
    private Integer usefulCount; // 有用数

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Integer getUsefulCount() {
        return usefulCount;
    }

    public void setUsefulCount(Integer usefulCount) {
        this.usefulCount = usefulCount;
    }
}
