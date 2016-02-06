package com.boxuanjia.style.ui.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class BaseMovieHolder extends RecyclerView.ViewHolder {

    protected ItemOnClickListener itemOnClickListener;

    public BaseMovieHolder(View itemView) {
        super(itemView);
    }

    public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
        this.itemOnClickListener = itemOnClickListener;
    }
}
