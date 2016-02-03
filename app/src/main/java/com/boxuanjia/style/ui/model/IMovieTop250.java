package com.boxuanjia.style.ui.model;

import java.util.List;

public interface IMovieTop250 {

    int length();

    String imageUrl(int position);

    String title(int position);

    List<String> genres(int position);

    float rating(int position);

}