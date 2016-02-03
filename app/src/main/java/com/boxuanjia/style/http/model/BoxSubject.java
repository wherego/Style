package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * US_BOX
 */
public class BoxSubject {

    @SerializedName("rank")
    @Expose
    private int rank; // 排名

    @SerializedName("box")
    @Expose
    private int box; // 票房

    @SerializedName("new")
    @Expose
    private boolean isNew; // 是否新上映

    @SerializedName("subject")
    @Expose
    private SimpleSubject subject; // 电影条目

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public SimpleSubject getSubject() {
        return subject;
    }

    public void setSubject(SimpleSubject subject) {
        this.subject = subject;
    }
}
