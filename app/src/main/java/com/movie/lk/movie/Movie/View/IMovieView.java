package com.movie.lk.movie.Movie.View;

import com.movie.lk.movie.Bean.MovieBean;

/**
 * File description
 *
 * @author lk
 * @date 2018/12/26 10 50
 */
public interface IMovieView {
    void showMovie(MovieBean movieBean);
    void hideDialog();
    void showDialog();
    void showErrorMsg(Throwable throwable);
}
