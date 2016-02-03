package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SampleMovie {

    @SerializedName("start")
    @Expose
    private int start; // start

    @SerializedName("count")
    @Expose
    private int count; // count

    @SerializedName("total")
    @Expose
    private int total; // 总数

    @SerializedName("subjects")
    @Expose
    private List<SimpleSubject> subjects = new ArrayList<SimpleSubject>(); // 电影条目

    @SerializedName("title")
    @Expose
    private String title; // 标题

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

    public List<SimpleSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SimpleSubject> subjects) {
        this.subjects = subjects;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
