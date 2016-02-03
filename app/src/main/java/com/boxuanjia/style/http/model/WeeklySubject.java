package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * weekly
 */
public class WeeklySubject {

    @SerializedName("rank")
    @Expose
    private int rank; // 排名

    @SerializedName("delta")
    @Expose
    private int delta; // 排名改变量

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
