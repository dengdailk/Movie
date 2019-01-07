package com.movie.lk.movie;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.movie.lk.movie.Bean.MovieBean;
import com.movie.lk.movie.Movie.MovieFragment;
import com.movie.lk.movie.Movie.MovieTopAdapter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

//    RecyclerView mRecyclerView;
//    List<MovieBean.SubjectsBean> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mRecyclerView = (RecyclerView) findViewById(R.id.activity_top250);

//       MovieTopAdapter movieTopAdapter = new MovieTopAdapter(this,list) ;
////       mRecyclerView.setLayoutManager();
//        mRecyclerView.setAdapter(movieTopAdapter);
    }
}
