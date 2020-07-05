package com.akameko.testfordigitalnomads.repository;

import com.akameko.testfordigitalnomads.repository.pojos.News;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {

    @GET("v2/everything?q=android&from=2019-04-00&sortBy=publishedAt&apiKey=26eddb253e7840f988aec61f2ece2907&page=1")
    Single<News> getNews();
}
