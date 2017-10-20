package com.blogspot.ramannada.simplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        TextView tvTitle = findViewById(R.id.tv_title);
        TextView tvDuration = findViewById(R.id.tv_duration);
        ImageView ivPoster = findViewById(R.id.iv_poster);


        Movie movie = getIntent().getParcelableExtra(MainActivity.KEY_MOVIE);

        tvTitle.setText(movie.getTitle());
        tvDuration.setText(movie.getDuration());
        ivPoster.setImageResource(movie.getPoster());

    }
}
