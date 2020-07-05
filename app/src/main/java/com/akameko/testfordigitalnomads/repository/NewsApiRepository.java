package com.akameko.testfordigitalnomads.repository;

import com.akameko.testfordigitalnomads.repository.pojos.News;

import io.reactivex.Single;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsApiRepository {
    private Retrofit retrofit;
    private NewsApi api;

    public NewsApiRepository() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://newsapi.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        api = retrofit.create(NewsApi.class);
    }


    public Single<News> getNews(String request) {
        return api.getNews();
    }
}
