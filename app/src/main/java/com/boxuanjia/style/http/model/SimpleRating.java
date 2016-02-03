package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SimpleRating {

    @SerializedName("min")
    @Expose
    private Integer min; // 最低评分

    @SerializedName("max")
    @Expose
    private Integer max; // 最高评分

    @SerializedName("average")
    @Expose
    private Float average; // 评分

    @SerializedName("stars")
    @Expose
    private String stars; // 评星数

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }
}
