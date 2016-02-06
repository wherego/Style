package com.boxuanjia.style.http;

import com.boxuanjia.style.http.model.MovieCelebrity;
import com.boxuanjia.style.http.model.MovieCelebrityPhoto;
import com.boxuanjia.style.http.model.MovieCelebrityWork;
import com.boxuanjia.style.http.model.MovieComingSoon;
import com.boxuanjia.style.http.model.MovieInTheaters;
import com.boxuanjia.style.http.model.MovieNew;
import com.boxuanjia.style.http.model.MovieSearch;
import com.boxuanjia.style.http.model.MovieSubject;
import com.boxuanjia.style.http.model.MovieSubjectComment;
import com.boxuanjia.style.http.model.MovieSubjectPhoto;
import com.boxuanjia.style.http.model.MovieSubjectReview;
import com.boxuanjia.style.http.model.MovieTop250;
import com.boxuanjia.style.http.model.MovieUSBox;
import com.boxuanjia.style.http.model.MovieWeekly;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface DouBanInterface {

    String BASE_URL = "https://api.douban.com";

    /*电影条目*/

    // 电影条目信息
    @GET("/v2/movie/subject/{id}")
    Observable<MovieSubject> getMovieSubject(@Path("id") String id);

    // 电影条目剧照
    @GET("/v2/movie/subject/{id}/photos")
    Observable<MovieSubjectPhoto> getMovieSubjectPhoto(@Path("id") String id, @Query("start") int start, @Query("count") int count);

    // 电影条目长评
    @GET("/v2/movie/subject/{id}/reviews")
    Observable<MovieSubjectReview> getMovieSubjectReview(@Path("id") int id, @Query("start") int start, @Query("count") int count);

    // 电影条目短评
    @GET("/v2/movie/subject/{id}/comments")
    Observable<MovieSubjectComment> getMovieSubjectComment(@Path("id") int id, @Query("start") int start, @Query("count") int count);

    /*影人条目*/

    // 影人条目信息
    @GET("/v2/movie/celebrity/{id}")
    Observable<MovieCelebrity> getMovieCelebrity(@Path("id") int id);

    // 影人剧照
    @GET("/v2/movie/celebrity/{id}/photos")
    Observable<MovieCelebrityPhoto> getMovieCelebrityPhoto(@Path("id") int id, @Query("start") int start, @Query("count") int count);

    // 影人作品
    @GET("/v2/movie/celebrity/{id}/works")
    Observable<MovieCelebrityWork> getMovieCelebrityWork(@Path("id") int id, @Query("start") int start, @Query("count") int count);

    /*搜索*/

    // 电影搜索
    @GET("/v2/movie/search")
    Observable<MovieSearch> getMovieSearch(@Query("q") String q, @Query("tag") String tag, @Query("start") int start, @Query("count") int count);

    /*榜单*/

    // 正在热映
    @GET("/v2/movie/in_theaters")
    Observable<MovieInTheaters> getMovieInTheaters(@Query("city") String city, @Query("start") int start, @Query("count") int count);

    // 即将上映
    @GET("/v2/movie/coming_soon")
    Observable<MovieComingSoon> getMovieComingSoon(@Query("start") int start, @Query("count") int count);

    // TOP250
    @GET("/v2/movie/top250")
    Observable<MovieTop250> getMovieTop250(@Query("start") int start, @Query("count") int count);

    // 口碑榜
    @GET("/v2/movie/weekly")
    Observable<MovieWeekly> getMovieWeekly();

    // 北美票房榜
    @GET("/v2/movie/us_box")
    Observable<MovieUSBox> getMovieUSBox();

    // 新片榜
    @GET("/v2/movie/new_movies")
    Observable<MovieNew> getMovieNew();

}
