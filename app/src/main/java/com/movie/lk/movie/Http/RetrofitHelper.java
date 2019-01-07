package com.movie.lk.movie.Http;

import com.movie.lk.movie.Bean.MovieBean;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * File description
 *
 * @author lk
 * @date 2018/12/26 10 08
 */
public class RetrofitHelper {
    private static OkHttpClient okHttpClient;
    private RetrofitService retrofitService;
    public  RetrofitHelper(String host){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(host)
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        retrofitService = retrofit.create(RetrofitService.class);

    }

    public rx.Observable<MovieBean> getMovies(String total){
        return retrofitService.getMovie(total);
    }

    public OkHttpClient getOkHttpClient(){
        if(okHttpClient == null){
            okHttpClient = new OkHttpClient.Builder()
                    .retryOnConnectionFailure(true)
                    .connectTimeout(30,TimeUnit.SECONDS)
                    .build();
        }
        return okHttpClient;
    }

}
