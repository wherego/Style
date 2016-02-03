package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject {

    @SerializedName("id")
    @Expose
    private String id; // 条目id

    @SerializedName("title")
    @Expose
    private String title; // 中文名

    @SerializedName("original_title")
    @Expose
    private String originalTitle; // 原名

    @SerializedName("genres")
    @Expose
    private List<String> genres = new ArrayList<String>(); // 类型

    @SerializedName("alt")
    @Expose
    private String alt; // 条目URL

    @SerializedName("images")
    @Expose
    private Image images; // 电影海报图

    @SerializedName("rating")
    @Expose
    private SimpleRating rating; // 评分

    @SerializedName("pubdates")
    @Expose
    private List<String> pubdates = new ArrayList<String>(); // 如果条目类型是电影则为上映日期,如果是电视剧则为首播日期

    @SerializedName("year")
    @Expose
    private String year; // 年代

    @SerializedName("subtype")
    @Expose
    private String subtype; // 条目分类,movie或者tv

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public SimpleRating getRating() {
        return rating;
    }

    public void setRating(SimpleRating rating) {
        this.rating = rating;
    }

    public List<String> getPubdates() {
        return pubdates;
    }

    public void setPubdates(List<String> pubdates) {
        this.pubdates = pubdates;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }
}
