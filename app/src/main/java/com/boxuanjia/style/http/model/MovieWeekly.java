package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 口碑榜
 */
public class MovieWeekly {

    @SerializedName("title")
    @Expose
    private String title; // 排行榜名称

    @SerializedName("subjects")
    @Expose
    private List<WeeklySubject> subjects = new ArrayList<WeeklySubject>(); // weekly条目列表

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<WeeklySubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<WeeklySubject> subjects) {
        this.subjects = subjects;
    }
}
