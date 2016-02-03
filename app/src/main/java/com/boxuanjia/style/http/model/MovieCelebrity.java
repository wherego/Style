package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 影人条目信息
 */
public class MovieCelebrity {

    @SerializedName("id")
    @Expose
    private String id; // 条目id

    @SerializedName("name")
    @Expose
    private String name; // 中文名

    @SerializedName("name_en")
    @Expose
    private String nameEn; // 英文名

    @SerializedName("alt")
    @Expose
    private String alt; // 条目页URL

    @SerializedName("mobile_url")
    @Expose
    private String mobileUrl; // 移动版条目页URL

    @SerializedName("avatars")
    @Expose
    private Avatars avatars; // 影人头像

    @SerializedName("summary")
    @Expose
    private String summary; // 简介

    @SerializedName("aka")
    @Expose
    private List<String> aka = new ArrayList<String>(); // 	更多中文名

    @SerializedName("aka_en")
    @Expose
    private List<String> akaEn = new ArrayList<String>(); // 更多英文名

    @SerializedName("website")
    @Expose
    private String website; // 官方网站

    @SerializedName("gender")
    @Expose
    private String gender; // 性别

    @SerializedName("birthday")
    @Expose
    private String birthday; // 出生日期

    @SerializedName("born_place")
    @Expose
    private String bornPlace; // 出生地

    @SerializedName("professions")
    @Expose
    private List<String> professions = new ArrayList<String>(); // 职业

    @SerializedName("constellation")
    @Expose
    private String constellation; // 星座

    @SerializedName("photos")
    @Expose
    private List<SimplePhoto> simplePhotos = new ArrayList<SimplePhoto>(); // 影人剧照,最多10张

    @SerializedName("works")
    @Expose
    private List<SimpleSubject> simpleSubjects = new ArrayList<SimpleSubject>(); // 影人作品,最多5部

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public Avatars getAvatars() {
        return avatars;
    }

    public void setAvatars(Avatars avatars) {
        this.avatars = avatars;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public List<String> getAkaEn() {
        return akaEn;
    }

    public void setAkaEn(List<String> akaEn) {
        this.akaEn = akaEn;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public void setProfessions(List<String> professions) {
        this.professions = professions;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public List<SimplePhoto> getSimplePhotos() {
        return simplePhotos;
    }

    public void setSimplePhotos(List<SimplePhoto> simplePhotos) {
        this.simplePhotos = simplePhotos;
    }

    public List<SimpleSubject> getSimpleSubjects() {
        return simpleSubjects;
    }

    public void setSimpleSubjects(List<SimpleSubject> simpleSubjects) {
        this.simpleSubjects = simpleSubjects;
    }
}
