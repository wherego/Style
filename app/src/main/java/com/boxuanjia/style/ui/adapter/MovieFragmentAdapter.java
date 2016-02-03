package com.boxuanjia.style.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.boxuanjia.style.ui.MovieComingSoonFragment;
import com.boxuanjia.style.ui.MovieInTheatersFragment;
import com.boxuanjia.style.ui.MovieTop250Fragment;

public class MovieFragmentAdapter extends FragmentPagerAdapter {

    private static final String TITLE_INTHEATER = "正在热映";

    private static final String TITLE_COMINGSOON = "即将上映";

    private static final String TITLE_TOP250 = "Top250";

    public MovieFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MovieInTheatersFragment();
            case 1:
                return new MovieComingSoonFragment();
            case 2:
                return new MovieTop250Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return TITLE_INTHEATER;
            case 1:
                return TITLE_COMINGSOON;
            case 2:
                return TITLE_TOP250;
            default:
                return "";
        }
    }
}
