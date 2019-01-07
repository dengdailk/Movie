package com.movie.lk.movie.Movie.Presenter;

import com.movie.lk.movie.Bean.MovieBean;
import com.movie.lk.movie.Movie.Model.IMovieListener;
import com.movie.lk.movie.Movie.Model.IMovieModel;
import com.movie.lk.movie.Movie.Model.MovieModel;
import com.movie.lk.movie.Movie.View.IMovieView;

/**
 * File description
 *
 * @author lk
 * @date 2018/12/26 10 53
 */
public class MoviePresenter implements IMoviePresenter,IMovieListener {

    private IMovieModel iMovieModel;
    private IMovieView iMovieView;

    public MoviePresenter(IMovieView iMovieView){
        this.iMovieView = iMovieView;
        this.iMovieModel = new MovieModel();
    }
    @Override
    public void success(MovieBean movieBean) {
        iMovieView.hideDialog();

            iMovieView.showMovie(movieBean);
    }

    @Override
    public void fail(Throwable throwable) {

        iMovieView.hideDialog();
        iMovieView.showErrorMsg(throwable);
    }

    @Override
    public void loadMovie(String total) {

        iMovieView.showDialog();
        iMovieModel.loadMovie(total,this);
    }
}
