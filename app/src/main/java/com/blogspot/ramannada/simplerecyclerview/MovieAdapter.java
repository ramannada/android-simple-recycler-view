package com.blogspot.ramannada.simplerecyclerview;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ramannada on 10/19/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {
    private List<Movie> datasheet;

    public MovieAdapter(List<Movie> datasheet) {
        this.datasheet = datasheet;
    }

    @Override
    public MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieHolder holder, int position) {
        Movie movie = datasheet.get(position);
        holder.bind(movie);
    }

    @Override
    public int getItemCount() {
        return datasheet.size();
    }

    class MovieHolder extends RecyclerView.ViewHolder{
        private TextView title, duration, synopsis, director, releaseDate, boxOffice;
        private ImageView poster;

        public MovieHolder(final View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tv_title);
            duration = itemView.findViewById(R.id.tv_duration);
            poster = itemView.findViewById(R.id.iv_poster);


        }

        void bind(Movie movie) {
            title.setText(movie.getTitle());
            duration.setText(movie.getDuration());
            poster.setImageResource(movie.getPoster());
        }
    }

}
