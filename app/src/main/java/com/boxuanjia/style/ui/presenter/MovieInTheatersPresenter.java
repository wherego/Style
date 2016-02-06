package com.boxuanjia.style.ui.presenter;

import com.boxuanjia.style.http.DouBan;
import com.boxuanjia.style.http.ErrorSubscriber;
import com.boxuanjia.style.http.model.MovieInTheaters;
import com.boxuanjia.style.http.model.SimpleSubject;
import com.boxuanjia.style.ui.model.IMovieInTheaters;
import com.boxuanjia.style.ui.view.IMovieView;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MovieInTheatersPresenter implements IMovieInTheaters {

    private static final int COUNT = 20;

    private IMovieView view;

    private List<SimpleSubject> simpleSubjects;

    private int start;

    private int total;

    public MovieInTheatersPresenter(IMovieView view) {
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

    @Override
    public float rating(int position) {
        return simpleSubjects.get(position).getRating().getAverage();
    }

    @Override
    public void onClick(int position) {
        Logger.d("编号 = " + position);
        String id = simpleSubjects.get(position).getId();
        // TODO 获得电影信息
        /*DouBan.INSTANCE.getDouBan().getMovieSubject(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorSubscriber());*/
        // TODO 获取电影剧照
        /*DouBan.INSTANCE.getDouBan().getMovieSubjectPhoto(id, 0, 20)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorSubscriber());*/
    }

    public void request() {
        DouBan.INSTANCE.getDouBan().getMovieInTheaters("天津", 0, COUNT)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(this::updateLength)
                .map(this::checkLoadMore)
                .map(this::updateList)
                .subscribe(new ErrorSubscriber());
    }

    public void loadMore() {
        DouBan.INSTANCE.getDouBan().getMovieInTheaters("天津", start, COUNT)
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
    private MovieInTheaters updateLength(MovieInTheaters movieInTheaters) {
        total = movieInTheaters.getTotal();
        start += movieInTheaters.getSubjects().size();
        return movieInTheaters;
    }

    /*
     * 检测是否需要加载更多
     */
    private List<SimpleSubject> checkLoadMore(MovieInTheaters movieInTheaters) {
        if (start >= total) {
            view.end(true);
            view.stopLoadMore();
        } else {
            view.end(false);
            view.stopLoadMore();
        }
        return movieInTheaters.getSubjects();
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
