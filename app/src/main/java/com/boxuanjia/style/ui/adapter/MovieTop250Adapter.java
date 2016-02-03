package com.boxuanjia.style.ui.adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.boxuanjia.loadmore.LoadMoreAdapter;
import com.boxuanjia.style.R;
import com.boxuanjia.style.ui.holder.MovieInTheatersHolder;
import com.boxuanjia.style.ui.holder.MovieTop250Holder;
import com.boxuanjia.style.ui.model.IMovieTop250;

import java.util.List;

public class MovieTop250Adapter extends LoadMoreAdapter {

    private IMovieTop250 iMovieTop250;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolderWithoutLoadMore(ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie_top_250, parent, false);
        return new MovieTop250Holder(view);
    }

    @Override
    public void onBindViewHolderWithoutLoadMore(RecyclerView.ViewHolder holder, int position) {
        Uri uri = Uri.parse(iMovieTop250.imageUrl(position));
        ((MovieTop250Holder) holder).setImage(uri);
        String name = iMovieTop250.title(position);
        ((MovieTop250Holder) holder).setName(name);
        List<String> genres = iMovieTop250.genres(position);
        ((MovieTop250Holder) holder).setGenres(genres);
        float rating = iMovieTop250.rating(position);
        ((MovieTop250Holder) holder).setRating(rating);
    }

    @Override
    public int getItemCountWithoutLoadMore() {
        if (iMovieTop250 == null) {
            return 0;
        } else {
            return iMovieTop250.length();
        }
    }

    @Override
    public int getItemViewTypeWithoutLoadMore(int position) {
        return 0;
    }

    public void setIMovieTop250(IMovieTop250 iMovieTop250) {
        this.iMovieTop250 = iMovieTop250;
    }
}
