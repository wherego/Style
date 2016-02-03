package com.boxuanjia.style.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 图片
 */
public class Photo {

    @SerializedName("id")
    @Expose
    private String id; // 图片id

    @SerializedName("subject_id")
    @Expose
    private String subjectId; // 条目id

    @SerializedName("alt")
    @Expose
    private String alt; // 图片展示页url

    @SerializedName("icon")
    @Expose
    private String icon; // 图片地址，icon尺寸

    @SerializedName("image")
    @Expose
    private String image; // 图片地址，image尺寸

    @SerializedName("thumb")
    @Expose
    private String thumb; // 图片地址，thumb尺寸

    @SerializedName("cover")
    @Expose
    private String cover; // 图片地址，cover尺寸

    @SerializedName("created_at")
    @Expose
    private String created_at; // 发布日期

    @SerializedName("desc")
    @Expose
    private String desc; // 图片描述

    @SerializedName("author")
    @Expose
    private SimpleUser simpleUser; // 上传用户

    @SerializedName("album_id")
    @Expose
    private String albumId; // 相册id

    @SerializedName("album_title")
    @Expose
    private String albumTitle; // 相册标题

    @SerializedName("album_url")
    @Expose
    private String albumUrl; // 相册地址

    @SerializedName("next_photo")
    @Expose
    private String nextPhoto; // 下一张图片

    @SerializedName("prev_photo")
    @Expose
    private String prevPhoto; // 上一张图片

    @SerializedName("position")
    @Expose
    private Integer position; // 图片在相册中的位置，按照时间排序

    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount; // 评论数

    @SerializedName("photos_count")
    @Expose
    private Integer photosCount; // 全部剧照数量

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SimpleUser getSimpleUser() {
        return simpleUser;
    }

    public void setSimpleUser(SimpleUser simpleUser) {
        this.simpleUser = simpleUser;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumUrl() {
        return albumUrl;
    }

    public void setAlbumUrl(String albumUrl) {
        this.albumUrl = albumUrl;
    }

    public String getNextPhoto() {
        return nextPhoto;
    }

    public void setNextPhoto(String nextPhoto) {
        this.nextPhoto = nextPhoto;
    }

    public String getPrevPhoto() {
        return prevPhoto;
    }

    public void setPrevPhoto(String prevPhoto) {
        this.prevPhoto = prevPhoto;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Integer getPhotosCount() {
        return photosCount;
    }

    public void setPhotosCount(Integer photosCount) {
        this.photosCount = photosCount;
    }
}
