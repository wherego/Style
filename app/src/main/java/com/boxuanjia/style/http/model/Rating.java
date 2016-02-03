
package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 评分
 */
public class Rating {

    @SerializedName("min")
    @Expose
    private Integer min; // 最低评分

    @SerializedName("max")
    @Expose
    private Integer max; // 最高评分

    @SerializedName("value")
    @Expose
    private Integer value; // 评分

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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
