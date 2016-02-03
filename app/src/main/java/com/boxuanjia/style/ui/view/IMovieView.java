package com.boxuanjia.style.ui.view;

public interface IMovieView {

    /**
     * 刷新
     */
    void refresh();

    /**
     * 停止加载更多
     */
    void stopLoadMore();

    /**
     * 是否没有更多内容加载了
     * @param end 结束
     */
    void end(boolean end);

    /**
     * 加载更多时是否有错误
     * @param error 错误
     */
    void error(boolean error);

}
