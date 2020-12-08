package com.example.moviebooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class showTicket extends AppCompatActivity {
    TextView seatText, movieText, dateText, locationText, bookedBy;
    Button home;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_ticket);

        Intent i = getIntent();
        String movie = i.getStringExtra("movie");
        String location = i.getStringExtra("location");
        String seat = i.getStringExtra("seats");
        String date = i.getStringExtra("date");

        movieText = findViewById(R.id.movie);
        seatText = findViewById(R.id.seat);
        dateText = findViewById(R.id.date);
        locationText = findViewById(R.id.location);
        bookedBy = findViewById(R.id.bookedBy);
        home = findViewById(R.id.homeBtn);

        movieText.setText(movie);
        seatText.setText(seat);
        locationText.setText(location);
        dateText.setText(date);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            name = user.getDisplayName();
        }

        bookedBy.setText("Booked by:"+name);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(showTicket.this, Home.class);
            }
        });
    }
}

