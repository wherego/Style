package com.boxuanjia.style.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.boxuanjia.style.R;
import com.boxuanjia.style.ui.adapter.MovieComingSoonAdapter;
import com.boxuanjia.style.ui.presenter.MovieComingSoonPresenter;
import com.boxuanjia.style.ui.view.IMovieView;
import com.boxuanjia.loadmore.LoadMoreListener;
import com.boxuanjia.loadmore.LoadMoreRecyclerView;

public class MovieComingSoonFragment extends BaseFragment implements IMovieView, LoadMoreRecyclerView.OnLoadMoreListener, LoadMoreListener {

    private LoadMoreRecyclerView recyclerView;

    private MovieComingSoonAdapter adapter;

    private MovieComingSoonPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        recyclerView = (LoadMoreRecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        recyclerView.setLoadMoreCount(9);
        recyclerView.setOnLoadMoreListener(this);
        adapter = new MovieComingSoonAdapter();
        adapter.setLoadMoreEnd(true);
        adapter.setLoadMoreError(false);
        adapter.setLoadMoreListener(this);
        recyclerView.setAdapter(adapter);
        if (presenter == null) {
            presenter = new MovieComingSoonPresenter(this);
            presenter.request();
        }
        adapter.setIMovieComingSoon(presenter);
        return view;
    }

    @Override
    public void refresh() {
        adapter.notifyDataSetChanged();
    }

    @Override
    public void stopLoadMore() {
        recyclerView.setLoadMore(false);
        adapter.notifyItemChanged(presenter.length());
    }

    @Override
    public void end(boolean end) {
        adapter.setLoadMoreEnd(end);
    }

    @Override
    public void error(boolean error) {
        adapter.setLoadMoreError(error);
    }

    @Override
    public void onLoadMore() {
        presenter.loadMore();
    }

    @Override
    public void onClickError() {
        presenter.loadMore();
    }
}
