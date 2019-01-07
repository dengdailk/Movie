package com.movie.lk.movie.Movie.Model;

import com.movie.lk.movie.Bean.MovieBean;

/**
 * File description
 *
 * @author lk
 * @date 2018/12/26 10 52
 */
public interface IMovieListener {
    void success(MovieBean movieBean);
    void fail(Throwable throwable);
}
