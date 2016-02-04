package com.boxuanjia.style;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.orhanobut.logger.Logger;

public class StyleApplication extends Application {

    private static final String TAG = "STYLE";

    @Override
    public void onCreate() {
        super.onCreate();
        setupLogger();
        setupFresco();
    }

    private void setupLogger() {
        Logger.init(TAG);
    }

    private void setupFresco() {
        Fresco.initialize(this);
    }

}
