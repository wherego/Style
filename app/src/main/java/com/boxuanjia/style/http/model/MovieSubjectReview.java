package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 电影条目影评列表
 */
public class MovieSubjectReview {

    @SerializedName("start")
    @Expose
    private int start; // start

    @SerializedName("count")
    @Expose
    private int count; // count

    @SerializedName("total")
    @Expose
    private int total; // 总数

    @SerializedName("subject")
    @Expose
    private SimpleSubject simpleSubject; // 电影条目

    @SerializedName("reviews")
    @Expose
    private List<Review> reviews = new ArrayList<Review>(); // 影评列表

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public SimpleSubject getSimpleSubject() {
        return simpleSubject;
    }

    public void setSimpleSubject(SimpleSubject simpleSubject) {
        this.simpleSubject = simpleSubject;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
