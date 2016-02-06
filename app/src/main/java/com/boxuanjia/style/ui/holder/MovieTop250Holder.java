package com.boxuanjia.style.ui.holder;

import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.boxuanjia.style.R;
import com.boxuanjia.style.ui.widget.RatingView;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class MovieTop250Holder extends BaseMovieHolder implements View.OnClickListener {

    private SimpleDraweeView image;

    private TextView textName;

    private TextView textGenres;

    private TextView textRating;

    private RatingView rating;

    public MovieTop250Holder(View itemView) {
        super(itemView);
        CardView cardView = (CardView) itemView.findViewById(R.id.card);
        cardView.setOnClickListener(this);
        image = (SimpleDraweeView) itemView.findViewById(R.id.image);
        textName = (TextView) itemView.findViewById(R.id.name);
        textGenres = (TextView) itemView.findViewById(R.id.genres);
        textRating = (TextView) itemView.findViewById(R.id.text_rating);
        rating = (RatingView) itemView.findViewById(R.id.rating);
    }

    public void setImage(Uri uri) {
        image.setImageURI(uri);
    }

    public void setName(String name) {
        textName.setText(name);
    }

    public void setGenres(List<String> genres) {
        String temp = "";
        for (int i = 0; i < genres.size(); i++) {
            temp += genres.get(i);
            if (i < genres.size() - 1) {
                temp += "/";
            }
        }
        textGenres.setText(temp);
    }

    public void setRating(float rating) {
        textRating.setText(String.valueOf(rating));
        this.rating.setPercent(rating * 10);
    }

    @Override
    public void onClick(View v) {
        if (itemOnClickListener == null) {
            return;
        }
        if (v.getId() == R.id.card) {
            itemOnClickListener.onClick(this);
        }
    }
}
