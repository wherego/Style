package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 影评
 */
public class Review {

    @SerializedName("id")
    @Expose
    private String id; // 图片id

    @SerializedName("title")
    @Expose
    private String title; // 影评名

    @SerializedName("alt")
    @Expose
    private String alt; // 影评url

    @SerializedName("created_at")
    @Expose
    private String createdAt; // 发布日期

    @SerializedName("updated_at")
    @Expose
    private String updatedAt; // 更新日期

    @SerializedName("subject_id")
    @Expose
    private String subjectId; // 条目id

    @SerializedName("author")
    @Expose
    private SimpleUser simpleUser; // 上传用户

    @SerializedName("summary")
    @Expose
    private String summary; // 摘要,100字以内

    @SerializedName("rating")
    @Expose
    private Rating rating; // 影评评分

    @SerializedName("useful_count")
    @Expose
    private Integer usefulCount; // 有用数

    @SerializedName("useless_count")
    @Expose
    private Integer uselessCount; // 无用数

    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount; // 评论数

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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public Integer getUselessCount() {
        return uselessCount;
    }

    public void setUselessCount(Integer uselessCount) {
        this.uselessCount = uselessCount;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }
}
