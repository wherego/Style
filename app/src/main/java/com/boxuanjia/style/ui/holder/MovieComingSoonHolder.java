package com.boxuanjia.style.ui.holder;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.boxuanjia.style.R;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class MovieComingSoonHolder extends RecyclerView.ViewHolder {

    private SimpleDraweeView image;

    private TextView textName;

    private TextView textGenres;

    public MovieComingSoonHolder(View itemView) {
        super(itemView);
        image = (SimpleDraweeView) itemView.findViewById(R.id.image);
        textName = (TextView) itemView.findViewById(R.id.name);
        textGenres = (TextView) itemView.findViewById(R.id.genres);
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

}
