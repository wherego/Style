package com.boxuanjia.style.http;

import com.boxuanjia.style.Config;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

public enum DouBan {

    INSTANCE;

    private DouBanInterface douBanInterface;

    DouBan() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(Config::setupHttpLogging);
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DouBanInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        douBanInterface = retrofit.create(DouBanInterface.class);
    }

    public DouBanInterface getDouBan() {
        return douBanInterface;
    }

}
