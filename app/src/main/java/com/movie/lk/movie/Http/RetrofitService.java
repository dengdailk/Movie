package com.movie.lk.movie.Http;

import com.movie.lk.movie.Bean.MovieBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * File description
 *
 * @author lk
 * @date 2018/12/26 10 08
 */
public interface RetrofitService {
    /**
     * https://api.douban.com/v2/movie/in_theaters
     */
    @GET("/v2/movie/{total}")
    Observable<MovieBean> getMovie(@Path("total") String total);
}
