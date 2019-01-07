package com.movie.lk.movie.Movie.Model;

import android.util.Log;

import com.movie.lk.movie.Bean.MovieBean;
import com.movie.lk.movie.Http.Api;
import com.movie.lk.movie.Http.RetrofitHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * File description
 *
 * @author lk
 * @date 2018/12/26 10 51
 */
public class MovieModel implements IMovieModel{
    private static final String TAG = "MoviesModel";
    @Override
    public void loadMovie(String total, final IMovieListener iMovieListener) {
        RetrofitHelper retrofitHelper = new RetrofitHelper(Api.MOVIE_HOST);
        retrofitHelper.getMovies(total)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<MovieBean>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        iMovieListener.fail(e);
                    }

                    @Override
                    public void onNext(MovieBean movieBean) {

                        iMovieListener.success(movieBean);
                        Log.i(TAG, "onNext: "+movieBean.getTotal());
                    }
                });
    }
}
