package com.boxuanjia.style;

import android.util.Log;

import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.orhanobut.logger.Logger;

public class Config {

    /**
     * 设置网络请求打印方式
     * @param message 内容
     */
    public static void setupHttpLogging(String message) {
        try {
            new JsonParser().parse(message);
            Logger.json(message);
        } catch (JsonSyntaxException e) {
            Log.d("OkHttp", message);
        }
    }

}
