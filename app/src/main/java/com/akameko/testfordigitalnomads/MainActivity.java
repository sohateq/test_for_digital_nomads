package com.akameko.testfordigitalnomads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.akameko.testfordigitalnomads.repository.NewsApiRepository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    NewsApiRepository newsApiRepository = new NewsApiRepository();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Disposable disposable = newsApiRepository.getNews("")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(news -> {


                    //Log.d("123", result.getItems().get(0).toString());
                    for (int i = 0; i < news.getArticles().size(); i++) {
                        Log.d("123", news.getArticles().get(i).toString());
                        //Log.d("123", "i " + String.valueOf(i));
                    }

                }, throwable -> {
                    Log.d("123", "Items loading failed", throwable);
                    //Toast.makeText(this,"load error", Toast.LENGTH_SHORT).show();
                });
    }
}
