package com.boxuanjia.style.ui.model;

import java.util.List;

public interface IMovieComingSoon {

    int length();

    String imageUrl(int position);

    String title(int position);

    List<String> genres(int position);

}
