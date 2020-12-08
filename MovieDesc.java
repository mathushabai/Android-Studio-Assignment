package com.example.moviebooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.moviebooking.ui.booking.BookingFragment;
import com.example.moviebooking.ui.home.HomeFragment;

public class MovieDesc extends AppCompatActivity {

    ImageView poster, star1, star2, star3, star4, star5, backBtn;
    TextView genre, title, desc, showtime, director;
    Button bookBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_desc);

        Intent i = getIntent();
        String movieTitle = i.getStringExtra("movieTitle");
        String releaseDate = i.getStringExtra("movieDate");
        String movieRate = i.getStringExtra("movieRate");
        String movieDesc = i.getStringExtra("movieDesc");
        String movieShowtime = i.getStringExtra("movieShowtime");
        String movieDir = i.getStringExtra("movieDir");
        String movieGenre = i.getStringExtra("movieGenre");
        int img = i.getIntExtra("moviePoster", 0);

        poster = findViewById(R.id.poster);
        star1 = findViewById(R.id.star1);
        star2 = findViewById(R.id.star2);
        star3 = findViewById(R.id.star3);
        star4 = findViewById(R.id.star4);
        star5 = findViewById(R.id.star5);
        genre = findViewById(R.id.genre);
        title = findViewById(R.id.movieTitle);
        desc = findViewById(R.id.desc);
        director = findViewById(R.id.movDirector);
        showtime = findViewById(R.id.showtime);
        backBtn = findViewById(R.id.backBtn);
        bookBtn = findViewById(R.id.bookNowBtn);

        poster.setImageResource(img);
        genre.setText(movieGenre);
        title.setText(movieTitle);
        desc.setText(movieDesc);
        director.setText("Directed by: "+movieDir);
        showtime.setText(movieShowtime);

        int starOn = getResources().getIdentifier("@android:drawable/btn_star_big_on", null,null);
        int starOff =  getResources().getIdentifier("@android:drawable/btn_star_big_off", null,null);

        String rating = movieRate.toString();
        switch (rating) {
            case "2/5":
                star1.setImageResource(starOn);
                star2.setImageResource(starOn);
                star3.setImageResource(starOff);
                star4.setImageResource(starOff);
                star5.setImageResource(starOff);
                break;
            case "3/5":
                star1.setImageResource(starOn);
                star2.setImageResource(starOn);
                star3.setImageResource(starOn);
                star4.setImageResource(starOff);
                star5.setImageResource(starOff);
                break;
            case "4/5":
                star1.setImageResource(starOn);
                star2.setImageResource(starOn);
                star3.setImageResource(starOn);
                star4.setImageResource(starOn);
                star5.setImageResource(starOff);
                break;
            case "5/5":
                star1.setImageResource(starOn);
                star2.setImageResource(starOn);
                star3.setImageResource(starOn);
                star4.setImageResource(starOn);
                star5.setImageResource(starOn);
                break;
            default:
                star1.setImageResource(starOn);
                star2.setImageResource(starOff);
                star3.setImageResource(starOff);
                star4.setImageResource(starOff);
                star5.setImageResource(starOff);
        }

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MovieDesc.this, Home.class);
                startActivity(i);
            }
        });

        bookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookingFragment fragment = new BookingFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.activity_container, fragment);
                transaction.commit();
            }
        });
    }
}
