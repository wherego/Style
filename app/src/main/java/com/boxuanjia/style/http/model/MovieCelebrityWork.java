package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 影人作品
 */
public class MovieCelebrityWork {

    @SerializedName("start")
    @Expose
    private int start; // start

    @SerializedName("count")
    @Expose
    private int count; // count

    @SerializedName("total")
    @Expose
    private int total; // 总数

    @SerializedName("celebrity")
    @Expose
    private SimpleCelebrity celebrity; // 影人条目

    @SerializedName("works")
    @Expose
    private List<SimpleSubject> works = new ArrayList<SimpleSubject>(); // 作品列表,包括作品及对应的角色

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

    public SimpleCelebrity getCelebrity() {
        return celebrity;
    }

    public void setCelebrity(SimpleCelebrity celebrity) {
        this.celebrity = celebrity;
    }

    public List<SimpleSubject> getWorks() {
        return works;
    }

    public void setWorks(List<SimpleSubject> works) {
        this.works = works;
    }

}
