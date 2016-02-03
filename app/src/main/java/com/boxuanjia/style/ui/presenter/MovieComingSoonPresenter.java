package com.boxuanjia.style.ui.presenter;

import com.boxuanjia.style.http.DouBan;
import com.boxuanjia.style.http.ErrorSubscriber;
import com.boxuanjia.style.http.model.MovieComingSoon;
import com.boxuanjia.style.http.model.SimpleSubject;
import com.boxuanjia.style.ui.model.IMovieComingSoon;
import com.boxuanjia.style.ui.view.IMovieView;

import java.util.ArrayList;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MovieComingSoonPresenter implements IMovieComingSoon {

    private static final int COUNT = 24;

    private IMovieView view;

    private List<SimpleSubject> simpleSubjects;

    private int start;

    private int total;

    public MovieComingSoonPresenter(IMovieView view) {
        this.view = view;
        simpleSubjects = new ArrayList<SimpleSubject>();
    }

    @Override
    public int length() {
        return simpleSubjects.size();
    }

    @Override
    public String imageUrl(int position) {
        return simpleSubjects.get(position).getImages().getLarge();
    }

    @Override
    public String title(int position) {
        return simpleSubjects.get(position).getTitle();
    }

    @Override
    public List<String> genres(int position) {
        return simpleSubjects.get(position).getGenres();
    }

    public void request() {
        DouBan.INSTANCE.getDouBan().getMovieComingSoon(0, COUNT)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(this::updateLength)
                .map(this::checkLoadMore)
                .map(this::updateList)
                .subscribe(new ErrorSubscriber());
    }

    public void loadMore() {
        DouBan.INSTANCE.getDouBan().getMovieComingSoon(start, COUNT)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(this::updateLength)
                .map(this::checkLoadMore)
                .map(this::updateList)
                .subscribe(new ErrorSubscriber() {

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        view.error(true);
                        view.stopLoadMore();
                    }
                });
    }

    /*
     * 获得列表长度
     */
    private MovieComingSoon updateLength(MovieComingSoon movieComingSoon) {
        total = movieComingSoon.getTotal();
        start += movieComingSoon.getSubjects().size();
        return movieComingSoon;
    }

    /*
     * 检测是否需要加载更多
     */
    private List<SimpleSubject> checkLoadMore(MovieComingSoon movieComingSoon) {
        if (start >= total) {
            view.end(true);
            view.stopLoadMore();
        } else {
            view.end(false);
            view.stopLoadMore();
        }
        return movieComingSoon.getSubjects();
    }

    /*
     * 更新列表
     */
    private Object updateList(List<SimpleSubject> list) {
        simpleSubjects.addAll(list);
        view.refresh();
        return null;
    }

}
