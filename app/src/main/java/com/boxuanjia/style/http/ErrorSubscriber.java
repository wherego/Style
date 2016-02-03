package com.boxuanjia.style.http;

import com.orhanobut.logger.Logger;

import rx.Subscriber;

public class ErrorSubscriber extends Subscriber<Object> {

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        Logger.d(e.toString());
    }

    @Override
    public void onNext(Object o) {

    }
}
