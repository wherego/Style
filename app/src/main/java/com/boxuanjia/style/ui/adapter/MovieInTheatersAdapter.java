package com.boxuanjia.style.ui.adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.boxuanjia.style.R;
import com.boxuanjia.style.ui.holder.ItemOnClickListener;
import com.boxuanjia.style.ui.holder.MovieInTheatersHolder;
import com.boxuanjia.style.ui.model.IMovieInTheaters;
import com.boxuanjia.loadmore.LoadMoreAdapter;

import java.util.List;

public class MovieInTheatersAdapter extends LoadMoreAdapter implements ItemOnClickListener {

    private IMovieInTheaters iMovieInTheaters;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolderWithoutLoadMore(ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie_in_theaters, parent, false);
        MovieInTheatersHolder holder = new MovieInTheatersHolder(view);
        holder.setItemOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolderWithoutLoadMore(RecyclerView.ViewHolder holder, int position) {
        Uri uri = Uri.parse(iMovieInTheaters.imageUrl(position));
        ((MovieInTheatersHolder)holder).setImage(uri);
        String name = iMovieInTheaters.title(position);
        ((MovieInTheatersHolder)holder).setName(name);
        List<String> genres = iMovieInTheaters.genres(position);
        ((MovieInTheatersHolder)holder).setGenres(genres);
        float rating = iMovieInTheaters.rating(position);
        ((MovieInTheatersHolder)holder).setRating(rating);
    }

    @Override
    public int getItemCountWithoutLoadMore() {
        if (iMovieInTheaters == null) {
            return 0;
        } else {
            return iMovieInTheaters.length();
        }
    }

    @Override
    public int getItemViewTypeWithoutLoadMore(int position) {
        return 0;
    }

    public void setIMovieInTheaters(IMovieInTheaters iMovieInTheaters) {
        this.iMovieInTheaters = iMovieInTheaters;
    }

    @Override
    public void onClick(RecyclerView.ViewHolder viewHolder) {
        iMovieInTheaters.onClick(viewHolder.getLayoutPosition());
    }
}
