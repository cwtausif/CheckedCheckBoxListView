package com.tutorialscache.checkboxlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mlistView;
    Context context;
    ArrayList<MovieModel> moviesData;
    MoviesAdapter moviesAdapter;
    MovieModel movieModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);

        //getviews
        mlistView = findViewById(R.id.listview_list);
        moviesData = new ArrayList<>();

        //add Countries Data
        addMoviesData();

        moviesAdapter =new MoviesAdapter(context,moviesData);
        mlistView.setAdapter(moviesAdapter);
    }

    private void addMoviesData() {
        //Movie1
        movieModel =new MovieModel();
        movieModel.setId(1);
        movieModel.setMoviename("Avangers");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie2
        movieModel =new MovieModel();
        movieModel.setId(2);
        movieModel.setMoviename("InfinityWar");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie3
        movieModel =new MovieModel();
        movieModel.setId(3);
        movieModel.setMoviename("Need For Speed");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie4
        movieModel =new MovieModel();
        movieModel.setId(4);
        movieModel.setMoviename("Deadpool");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie5
        movieModel =new MovieModel();
        movieModel.setId(5);
        movieModel.setMoviename("War");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie6
        movieModel =new MovieModel();
        movieModel.setId(6);
        movieModel.setMoviename("Twilight");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie7
        movieModel =new MovieModel();
        movieModel.setId(7);
        movieModel.setMoviename("Twilight saga");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie8
        movieModel =new MovieModel();
        movieModel.setId(8);
        movieModel.setMoviename("ABCD");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie9
        movieModel =new MovieModel();
        movieModel.setId(9);
        movieModel.setMoviename("ABCD2");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie10
        movieModel =new MovieModel();
        movieModel.setId(10);
        movieModel.setMoviename("Dhoom");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie11
        movieModel =new MovieModel();
        movieModel.setId(11);
        movieModel.setMoviename("See");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie12
        movieModel =new MovieModel();
        movieModel.setId(12);
        movieModel.setMoviename("Batman");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie13
        movieModel =new MovieModel();
        movieModel.setId(13);
        movieModel.setMoviename("Man Of Steel");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie14
        movieModel =new MovieModel();
        movieModel.setId(14);
        movieModel.setMoviename("Age of Altron");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie15
        movieModel =new MovieModel();
        movieModel.setId(15);
        movieModel.setMoviename("Ender Games");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
        //Movie16
        movieModel =new MovieModel();
        movieModel.setId(16);
        movieModel.setMoviename("Speed");
        movieModel.setIschecked(false);
        moviesData.add(movieModel);
    }
}
