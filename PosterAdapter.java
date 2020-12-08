package com.example.moviebooking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.example.moviebooking.Poster;

public class PosterAdapter extends RecyclerView.Adapter<PosterAdapter.PosterViewHolder> {

    List<Poster> movies;
    Context ctx;

    public PosterAdapter(Context ctx, List<Poster> movies) {
        this.movies = movies;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public PosterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.movie_posters, parent, false);
        return new PosterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PosterViewHolder holder, int position) {
        holder.title.setText(movies.get(position).getTitle());
        holder.date.setText(movies.get(position).getDate());
        holder.poster.setImageResource(movies.get(position).getPoster());
        holder.genre.setText(movies.get(position).getGenre());
        holder.director.setText(movies.get(position).getDirector());
        holder.rating.setText(movies.get(position).getRating());
        holder.showtime.setText(movies.get(position).getShowtime());
        final int pos2 = position;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(ctx, MovieDesc.class);
            i.putExtra("movieTitle",movies.get(pos2).getTitle());
            i.putExtra("movieDate",movies.get(pos2).getDate());
            i.putExtra("moviePoster",movies.get(pos2).getPoster());
            i.putExtra("movieGenre",movies.get(pos2).getGenre());
            i.putExtra("movieDir",movies.get(pos2).getDirector());
            i.putExtra("movieRate",movies.get(pos2).getRating());
            i.putExtra("movieShowtime",movies.get(pos2).getShowtime());
            i.putExtra("movieDesc",movies.get(pos2).getDesc());

            ctx.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static final class PosterViewHolder extends RecyclerView.ViewHolder {

        TextView title, desc, date, showtime, director, rating, genre;
        ImageView poster;

        public PosterViewHolder(@NonNull View itemView) {
            super(itemView);

            poster = itemView.findViewById(R.id.poster);
            title = itemView.findViewById(R.id.movieTitle);
            showtime = itemView.findViewById(R.id.showtime);
            date = itemView.findViewById(R.id.date);
            director = itemView.findViewById(R.id.director);
            rating = itemView.findViewById(R.id.rating);
            genre = itemView.findViewById(R.id.genre);
        }
    }

}
