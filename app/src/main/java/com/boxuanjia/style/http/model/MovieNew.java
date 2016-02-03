package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 新片榜
 */
public class MovieNew {

    @SerializedName("title")
    @Expose
    private String title; // 排行榜名称

    @SerializedName("subjects")
    @Expose
    private List<SimpleSubject> subjects = new ArrayList<SimpleSubject>(); // 条目列表

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SimpleSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SimpleSubject> subjects) {
        this.subjects = subjects;
    }
}
