
package com.boxuanjia.style.http.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 电影条目信息
 */
public class MovieSubject {

    @SerializedName("id")
    @Expose
    private String id; // 条目id

    @SerializedName("title")
    @Expose
    private String title; // 中文名

    @SerializedName("original_title")
    @Expose
    private String originalTitle; // 原名

    @SerializedName("aka")
    @Expose
    private List<String> aka = new ArrayList<String>(); // 又名

    @SerializedName("alt")
    @Expose
    private String alt; // 条目页URL

    @SerializedName("mobile_url")
    @Expose
    private String mobileUrl; // 移动版条目页URL

    @SerializedName("rating")
    @Expose
    private SimpleRating rating; // 评分

    @SerializedName("ratings_count")
    @Expose
    private Integer ratingsCount; // 评分人数

    @SerializedName("wish_count")
    @Expose
    private Integer wishCount; // 想看人数

    @SerializedName("collect_count")
    @Expose
    private Integer collectCount; // 看过人数

    @SerializedName("do_count")
    @Expose
    private Integer doCount; // 在看人数,如果是电视剧,默认值为0,如果是电影值为null

    @SerializedName("images")
    @Expose
    private Image images; // 电影海报图

    @SerializedName("subtype")
    @Expose
    private String subtype; // 条目分类, movie或者tv

    @SerializedName("directors")
    @Expose
    private List<Director> directors = new ArrayList<Director>(); // 导演

    @SerializedName("casts")
    @Expose
    private List<Cast> casts = new ArrayList<Cast>(); // 主演,最多可获得4个

    @SerializedName("writers")
    @Expose
    private List<Writer> writers = new ArrayList<Writer>(); // 编剧

    @SerializedName("website")
    @Expose
    private String website; // 官方网站

    @SerializedName("douban_site")
    @Expose
    private String doubanSite; // 豆瓣小站

    @SerializedName("pubdates")
    @Expose
    private List<String> pubdates = new ArrayList<String>(); // 如果条目类型是电影则为上映日期,如果是电视剧则为首播日期

    @SerializedName("mainland_pubdate")
    @Expose
    private String mainlandPubdate; // 大陆上映日期,如果条目类型是电影则为上映日期,如果是电视剧则为首播日期

    @SerializedName("year")
    @Expose
    private String year; // 年代

    @SerializedName("languages")
    @Expose
    private List<String> languages = new ArrayList<String>(); // 语言

    @SerializedName("durations")
    @Expose
    private List<String> durations = new ArrayList<String>(); // 片长

    @SerializedName("genres")
    @Expose
    private List<String> genres = new ArrayList<String>(); // 影片类型,最多提供3个

    @SerializedName("countries")
    @Expose
    private List<String> countries = new ArrayList<String>(); // 制片国家/地区

    @SerializedName("summary")
    @Expose
    private String summary; // 简介

    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount; // 短评数量

    @SerializedName("reviews_count")
    @Expose
    private Integer reviewsCount; // 影评数量

    @SerializedName("seasons_count")
    @Expose
    private Integer seasonsCount; // 总季数(tv only)

    @SerializedName("current_season")
    @Expose
    private Integer currentSeason; // 当前季数(tv only)

    @SerializedName("episodes_count")
    @Expose
    private Integer episodesCount; // 当前季的集数(tv only)

    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl; // 影讯页URL(movie only)

    @SerializedName("trailer_urls")
    @Expose
    private List<String> trailerUrls = new ArrayList<String>(); // 预告片URL,对高级用户以上开放,最多开放4个地址

    @SerializedName("clip_urls")
    @Expose
    private List<String> clipUrls = new ArrayList<String>(); // 片段URL,对高级用户以上开放,最多开放4个地址

    @SerializedName("blooper_urls")
    @Expose
    private List<String> blooperUrls = new ArrayList<String>(); // 花絮URL,对高级用户以上开放,最多开放4个地址

    @SerializedName("photos")
    @Expose
    private List<SimplePhoto> simplePhotos = new ArrayList<SimplePhoto>(); // 电影剧照,前10张

    @SerializedName("popular_reviews")
    @Expose
    private List<SimpleReview> simpleReviews = new ArrayList<SimpleReview>(); // 影评,前10条

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

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
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

    public SimpleRating getRating() {
        return rating;
    }

    public void setRating(SimpleRating rating) {
        this.rating = rating;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public Integer getWishCount() {
        return wishCount;
    }

    public void setWishCount(Integer wishCount) {
        this.wishCount = wishCount;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getDoCount() {
        return doCount;
    }

    public void setDoCount(Integer doCount) {
        this.doCount = doCount;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public List<Writer> getWriters() {
        return writers;
    }

    public void setWriters(List<Writer> writers) {
        this.writers = writers;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDoubanSite() {
        return doubanSite;
    }

    public void setDoubanSite(String doubanSite) {
        this.doubanSite = doubanSite;
    }

    public List<String> getPubdates() {
        return pubdates;
    }

    public void setPubdates(List<String> pubdates) {
        this.pubdates = pubdates;
    }

    public String getMainlandPubdate() {
        return mainlandPubdate;
    }

    public void setMainlandPubdate(String mainlandPubdate) {
        this.mainlandPubdate = mainlandPubdate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getDurations() {
        return durations;
    }

    public void setDurations(List<String> durations) {
        this.durations = durations;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public Integer getSeasonsCount() {
        return seasonsCount;
    }

    public void setSeasonsCount(Integer seasonsCount) {
        this.seasonsCount = seasonsCount;
    }

    public Integer getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Integer currentSeason) {
        this.currentSeason = currentSeason;
    }

    public Integer getEpisodesCount() {
        return episodesCount;
    }

    public void setEpisodesCount(Integer episodesCount) {
        this.episodesCount = episodesCount;
    }

    public String getScheduleUrl() {
        return scheduleUrl;
    }

    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    public List<String> getTrailerUrls() {
        return trailerUrls;
    }

    public void setTrailerUrls(List<String> trailerUrls) {
        this.trailerUrls = trailerUrls;
    }

    public List<String> getClipUrls() {
        return clipUrls;
    }

    public void setClipUrls(List<String> clipUrls) {
        this.clipUrls = clipUrls;
    }

    public List<String> getBlooperUrls() {
        return blooperUrls;
    }

    public void setBlooperUrls(List<String> blooperUrls) {
        this.blooperUrls = blooperUrls;
    }

    public List<SimplePhoto> getSimplePhotos() {
        return simplePhotos;
    }

    public void setSimplePhotos(List<SimplePhoto> simplePhotos) {
        this.simplePhotos = simplePhotos;
    }

    public List<SimpleReview> getSimpleReviews() {
        return simpleReviews;
    }

    public void setSimpleReviews(List<SimpleReview> simpleReviews) {
        this.simpleReviews = simpleReviews;
    }
}
