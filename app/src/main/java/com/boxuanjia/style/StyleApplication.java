package com.boxuanjia.style;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class StyleApplication extends Application {

    private static final String TAG = "STYLE";

    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        setupLeakcanary();
        setupLogger();
        setupFresco();
    }

    public static RefWatcher getRefWatcher(Context context) {
        StyleApplication application = (StyleApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    private void setupLeakcanary() {
        refWatcher = LeakCanary.install(this);
    }

    private void setupLogger() {
        Logger.init(TAG);
    }

    private void setupFresco() {
        Fresco.initialize(this);
    }

}
