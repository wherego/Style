package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 电影条目搜索
 */
public class MovieSearch {

    @SerializedName("start")
    @Expose
    private int start; // start

    @SerializedName("count")
    @Expose
    private int count; // count

    @SerializedName("total")
    @Expose
    private int total; // 总数,Basic最多只返回20条记录

    @SerializedName("query")
    @Expose
    private String query; // 搜索字符串

    @SerializedName("tag")
    @Expose
    private String tag; // 搜索标签

    @SerializedName("subjects")
    @Expose
    private List<SimpleSubject> subjects = new ArrayList<SimpleSubject>();

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

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<SimpleSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SimpleSubject> subjects) {
        this.subjects = subjects;
    }
}
