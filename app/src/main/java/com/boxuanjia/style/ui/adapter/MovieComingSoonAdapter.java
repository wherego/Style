package com.boxuanjia.style.ui.adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.boxuanjia.style.R;
import com.boxuanjia.style.ui.holder.MovieComingSoonHolder;
import com.boxuanjia.style.ui.model.IMovieComingSoon;
import com.boxuanjia.loadmore.LoadMoreAdapter;

import java.util.List;

public class MovieComingSoonAdapter extends LoadMoreAdapter {

    private IMovieComingSoon iMovieComingSoon;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolderWithoutLoadMore(ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie_coming_soon, parent, false);
        return new MovieComingSoonHolder(view);
    }

    @Override
    public void onBindViewHolderWithoutLoadMore(RecyclerView.ViewHolder holder, int position) {
        Uri uri = Uri.parse(iMovieComingSoon.imageUrl(position));
        ((MovieComingSoonHolder) holder).setImage(uri);
        String name = iMovieComingSoon.title(position);
        ((MovieComingSoonHolder) holder).setName(name);
        List<String> genres = iMovieComingSoon.genres(position);
        ((MovieComingSoonHolder) holder).setGenres(genres);
    }

    @Override
    public int getItemCountWithoutLoadMore() {
        if (iMovieComingSoon == null) {
            return 0;
        } else {
            return iMovieComingSoon.length();
        }
    }

    @Override
    public int getItemViewTypeWithoutLoadMore(int position) {
        return 0;
    }

    public void setIMovieComingSoon(IMovieComingSoon iMovieComingSoon) {
        this.iMovieComingSoon = iMovieComingSoon;
    }
}
