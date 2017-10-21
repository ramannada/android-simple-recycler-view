package com.blogspot.ramannada.simplerecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_MOVIE = "movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Movie> listMostPopular = new ArrayList<>();
        listMostPopular.add(new Movie("Spider-Man: Homecoming", "2h 3m", R.drawable.pocdtnt));
        listMostPopular.add(new Movie("Wonder Woman", "2h 21m", R.drawable.pocdtnt));
        listMostPopular.add(new Movie("Baby Driver", "1h 53m", R.drawable.pocdtnt));
        listMostPopular.add(new Movie("Star Wars: The Last Jedi", "2h 30m", R.drawable.pocdtnt));
        listMostPopular.add(new Movie("The Mummy", "1h 51m", R.drawable.pocdtnt));

        final List<Movie> listMostRecent = new ArrayList<>();
        listMostRecent.add(new Movie("The Mummy", "1h 51m", R.drawable.pocdtnt));
        listMostRecent.add(new Movie("Star Wars: The Last Jedi", "2h 30m", R.drawable.pocdtnt));
        listMostRecent.add(new Movie("Baby Driver", "1h 53m", R.drawable.pocdtnt));
        listMostRecent.add(new Movie("Spider-Man: Homecoming", "2h 3m", R.drawable.pocdtnt));
        listMostRecent.add(new Movie("Wonder Woman", "2h 21m", R.drawable.pocdtnt));

        RecyclerView rvMostPopular = findViewById(R.id.recycler_view_most_popular);

        MovieAdapter adapterMostPopular = new MovieAdapter(listMostPopular);
        rvMostPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvMostPopular.setAdapter(adapterMostPopular);

        rvMostPopular.addOnItemTouchListener(new RecyclerTouchListener(this, rvMostPopular, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent i = new Intent(MainActivity.this, MovieDetailActivity.class);
                i.putExtra(KEY_MOVIE, listMostPopular.get(position));
                startActivity(i);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        RecyclerView rvMostRecent = findViewById(R.id.recycler_view_most_recent);

        MovieAdapter adapterMostRecent = new MovieAdapter(listMostRecent);
        rvMostRecent.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvMostRecent.setAdapter((adapterMostRecent));

        rvMostRecent.addOnItemTouchListener(new RecyclerTouchListener(this, rvMostRecent, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent i = new Intent(MainActivity.this, MovieDetailActivity.class);
                i.putExtra(KEY_MOVIE, listMostRecent.get(position));
                startActivity(i);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }
}
