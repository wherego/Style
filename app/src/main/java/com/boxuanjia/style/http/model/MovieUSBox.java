package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 北美票房榜
 */
public class MovieUSBox {

    @SerializedName("title")
    @Expose
    private String title; // 排行榜名称

    @SerializedName("date")
    @Expose
    private String date; // 排行榜日期范围

    @SerializedName("subjects")
    @Expose
    private List<BoxSubject> subjects = new ArrayList<BoxSubject>(); // usbox条目列表

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<BoxSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<BoxSubject> subjects) {
        this.subjects = subjects;
    }
}
