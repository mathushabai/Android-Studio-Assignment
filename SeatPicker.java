package com.example.moviebooking;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class SeatPicker extends AppCompatActivity implements View.OnClickListener {

    String chosenTime, chosenSeat, location, movie, date;
    Button bookBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seat_picker);

        Intent i = getIntent();
        location = i.getStringExtra("location");
        movie = i.getStringExtra("movie");
        date = i.getStringExtra("date");

        TextView time1 = findViewById(R.id.time1);
        TextView time2 = findViewById(R.id.time2);
        TextView time3 = findViewById(R.id.time3);
        TextView time4 = findViewById(R.id.time4);
        TextView time5 = findViewById(R.id.time5);
        time1.setOnClickListener(this);
        time2.setOnClickListener(this);
        time3.setOnClickListener(this);
        time4.setOnClickListener(this);
        time5.setOnClickListener(this);
        bookBtn = findViewById(R.id.bookBtn);
        initializeSeats();

        bookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), showTicket.class);
                i.putExtra("location", location);
                i.putExtra("movie", movie);
                i.putExtra("date", date);
                i.putExtra("time", chosenTime);
                i.putExtra("seats", chosenSeat);
                startActivity(i);
            }
        });
    }

    protected void initializeSeats() {
        Button a1 = findViewById(R.id.a1);
        a1.setOnClickListener(this);
        Button a2 = findViewById(R.id.a2);
        a2.setOnClickListener(this);
        Button a3 = findViewById(R.id.a3);
        a3.setOnClickListener(this);
        Button a4 = findViewById(R.id.a4);
        a4.setOnClickListener(this);
        Button a5 = findViewById(R.id.a5);
        a5.setOnClickListener(this);
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        Button b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
        Button b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);
        Button b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);
        Button b5 = findViewById(R.id.b5);
        b5.setOnClickListener(this);
        Button b6 = findViewById(R.id.b6);
        b6.setOnClickListener(this);
        Button b7 = findViewById(R.id.b7);
        b7.setOnClickListener(this);
        Button b8 = findViewById(R.id.b8);
        b8.setOnClickListener(this);
        Button b9 = findViewById(R.id.b9);
        b9.setOnClickListener(this);
        Button c1 = findViewById(R.id.c1);
        c1.setOnClickListener(this);
        Button c2 = findViewById(R.id.c2);
        c2.setOnClickListener(this);
        Button c3 = findViewById(R.id.c3);
        c3.setOnClickListener(this);
        Button c4 = findViewById(R.id.c4);
        c4.setOnClickListener(this);
        Button c5 = findViewById(R.id.c5);
        c5.setOnClickListener(this);
        Button c6 = findViewById(R.id.c6);
        c6.setOnClickListener(this);
        Button c7 = findViewById(R.id.c7);
        c7.setOnClickListener(this);
        Button d1 = findViewById(R.id.d1);
        d1.setOnClickListener(this);
        Button d2 = findViewById(R.id.d2);
        d2.setOnClickListener(this);
        Button d3 = findViewById(R.id.d3);
        d3.setOnClickListener(this);
        Button d4 = findViewById(R.id.d4);
        d4.setOnClickListener(this);
        Button d5 = findViewById(R.id.d5);
        d5.setOnClickListener(this);
        Button d6 = findViewById(R.id.d6);
        d6.setOnClickListener(this);
        Button d7 = findViewById(R.id.d7);
        d7.setOnClickListener(this);
        Button e1 = findViewById(R.id.e1);
        e1.setOnClickListener(this);
        Button e2 = findViewById(R.id.e2);
        e2.setOnClickListener(this);
        Button e3 = findViewById(R.id.e3);
        e3.setOnClickListener(this);
        Button e4 = findViewById(R.id.e4);
        e4.setOnClickListener(this);
        Button e5 = findViewById(R.id.e5);
        e5.setOnClickListener(this);
        Button e6 = findViewById(R.id.e6);
        e6.setOnClickListener(this);
        Button e7 = findViewById(R.id.e7);
        e7.setOnClickListener(this);
        Button e8 = findViewById(R.id.e8);
        e8.setOnClickListener(this);
        Button e9 = findViewById(R.id.e9);
        e9.setOnClickListener(this);
        Button f1 = findViewById(R.id.f1);
        f1.setOnClickListener(this);
        Button f2 = findViewById(R.id.f2);
        f2.setOnClickListener(this);
        Button f3 = findViewById(R.id.f3);
        f3.setOnClickListener(this);
        Button f4 = findViewById(R.id.f4);
        f4.setOnClickListener(this);
        Button f5 = findViewById(R.id.e5);
        f5.setOnClickListener(this);
        Button f6 = findViewById(R.id.f6);
        f6.setOnClickListener(this);
        Button f7 = findViewById(R.id.f7);
        f7.setOnClickListener(this);
        Button f8 = findViewById(R.id.f8);
        f8.setOnClickListener(this);
        Button f9 = findViewById(R.id.f9);
        f9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.time1:
                TextView time1 = v.findViewById(R.id.time1);
                time1.setBackgroundColor(Color.parseColor("#AC1EC5"));
                chosenTime = "1";
                break;
            case R.id.time2:
                TextView time2 = v.findViewById(R.id.time2);
                time2.setBackgroundColor(Color.parseColor("#AC1EC5"));
                chosenTime = "2";
                break;
            case R.id.time3:
                TextView time3 = v.findViewById(R.id.time3);
                time3.setBackgroundColor(Color.parseColor("#AC1EC5"));
                chosenTime = "3";
                break;
            case R.id.time4:
                TextView time4 = v.findViewById(R.id.time4);
                time4.setBackgroundColor(Color.parseColor("#AC1EC5"));
                chosenTime = "4";
                break;
            case R.id.time5:
                TextView time5 = v.findViewById(R.id.time5);
                time5.setBackgroundColor(Color.parseColor("#AC1EC5"));
                chosenTime = "5";
                break;
            case R.id.a1:
                Button a1 = v.findViewById(R.id.a1);
                a1.setBackgroundColor(Color.WHITE);
                chosenSeat += "a1";
                break;
            case R.id.a2:
                Button a2 = v.findViewById(R.id.a2);
                a2.setBackgroundColor(Color.WHITE);
                chosenSeat += "a2";
                break;
            case R.id.a3:
                Button a3 = v.findViewById(R.id.a3);
                a3.setBackgroundColor(Color.WHITE);
                chosenSeat += "a3";
                break;
            case R.id.a4:
                Button a4 = v.findViewById(R.id.a4);
                a4.setBackgroundColor(Color.WHITE);
                chosenSeat += "a4";
                break;
            case R.id.a5:
                Button a5 = v.findViewById(R.id.a5);
                a5.setBackgroundColor(Color.WHITE);
                chosenSeat = "a5";
                break;
            case R.id.b1:
                Button b1 = v.findViewById(R.id.b1);
                b1.setBackgroundColor(Color.WHITE);
                chosenSeat += "b1";
                break;
            case R.id.b2:
                Button b2 = v.findViewById(R.id.b2);
                b2.setBackgroundColor(Color.WHITE);
                chosenSeat += "b2, ";
                break;
            case R.id.b3:
                Button b3 = v.findViewById(R.id.b3);
                b3.setBackgroundColor(Color.WHITE);
                chosenSeat += "b3, ";
                break;
            case R.id.b4:
                Button b4 = v.findViewById(R.id.b4);
                b4.setBackgroundColor(Color.WHITE);
                chosenSeat += "b4, ";
                break;
            case R.id.b5:
                Button b5 = v.findViewById(R.id.b5);
                b5.setBackgroundColor(Color.WHITE);
                chosenSeat += "b5, ";
                break;
            case R.id.b6:
                Button b6 = v.findViewById(R.id.b6);
                b6.setBackgroundColor(Color.WHITE);
                chosenSeat += "b6, ";
                break;
            case R.id.b7:
                Button b7 = v.findViewById(R.id.b7);
                b7.setBackgroundColor(Color.WHITE);
                chosenSeat += "b7, ";
                break;
            case R.id.b8:
                Button b8 = v.findViewById(R.id.b8);
                b8.setBackgroundColor(Color.WHITE);
                chosenSeat += "b8, ";
                break;
            case R.id.b9:
                Button b9 = v.findViewById(R.id.b9);
                b9.setBackgroundColor(Color.WHITE);
                chosenSeat += "b9, ";
                break;
            case R.id.c1:
                Button c1 = v.findViewById(R.id.c1);
                c1.setBackgroundColor(Color.WHITE);
                chosenSeat += "c1, ";
                break;
            case R.id.c2:
                Button c2 = v.findViewById(R.id.c2);
                c2.setBackgroundColor(Color.WHITE);
                chosenSeat += "c2, ";
                break;
            case R.id.c3:
                Button c3 = v.findViewById(R.id.c3);
                c3.setBackgroundColor(Color.WHITE);
                chosenSeat += "c3, ";
                break;
            case R.id.c4:
                Button c4 = v.findViewById(R.id.c4);
                c4.setBackgroundColor(Color.WHITE);
                chosenSeat += "c4, ";
                break;
            case R.id.c5:
                Button c5 = v.findViewById(R.id.c5);
                c5.setBackgroundColor(Color.WHITE);
                chosenSeat += "c5, ";
                break;
            case R.id.c6:
                Button c6 = v.findViewById(R.id.c6);
                c6.setBackgroundColor(Color.WHITE);
                chosenSeat += "c6, ";
                break;
            case R.id.c7:
                Button c7 = v.findViewById(R.id.c7);
                c7.setBackgroundColor(Color.WHITE);
                chosenSeat += "c7, ";
                break;
            case R.id.d1:
                Button d1 = v.findViewById(R.id.d1);
                d1.setBackgroundColor(Color.WHITE);
                chosenSeat += "d1, ";
                break;
            case R.id.d2:
                Button d2 = v.findViewById(R.id.d2);
                d2.setBackgroundColor(Color.WHITE);
                chosenSeat += "d2, ";
                break;
            case R.id.d3:
                Button d3 = v.findViewById(R.id.d3);
                d3.setBackgroundColor(Color.WHITE);
                chosenSeat += "d3, ";
                break;
            case R.id.d4:
                Button d4 = v.findViewById(R.id.d4);
                d4.setBackgroundColor(Color.WHITE);
                chosenSeat += "d4, ";
                break;
            case R.id.d5:
                Button d5 = v.findViewById(R.id.d5);
                d5.setBackgroundColor(Color.WHITE);
                chosenSeat += "d5, ";
                break;
            case R.id.d6:
                Button d6 = v.findViewById(R.id.d6);
                d6.setBackgroundColor(Color.WHITE);
                chosenSeat += "d6, ";
                break;
            case R.id.d7:
                Button d7 = v.findViewById(R.id.d7);
                d7.setBackgroundColor(Color.WHITE);
                chosenSeat += "d7, ";
                break;
            case R.id.e1:
                Button e1 = v.findViewById(R.id.e1);
                e1.setBackgroundColor(Color.WHITE);
                chosenSeat += "e1, ";
                break;
            case R.id.e2:
                Button e2 = v.findViewById(R.id.e2);
                e2.setBackgroundColor(Color.WHITE);
                chosenSeat += "e2, ";
                break;
            case R.id.e3:
                Button e3 = v.findViewById(R.id.e3);
                e3.setBackgroundColor(Color.WHITE);
                chosenSeat += "e3, ";
                break;
            case R.id.e4:
                Button e4 = v.findViewById(R.id.e4);
                e4.setBackgroundColor(Color.WHITE);
                chosenSeat += "e4, ";
                break;
            case R.id.e5:
                Button e5 = v.findViewById(R.id.e5);
                e5.setBackgroundColor(Color.WHITE);
                chosenSeat += "e5, ";
                break;
            case R.id.e6:
                Button e6 = v.findViewById(R.id.e6);
                e6.setBackgroundColor(Color.WHITE);
                chosenSeat += "e6, ";
                break;
            case R.id.e7:
                Button e7 = v.findViewById(R.id.e7);
                e7.setBackgroundColor(Color.WHITE);
                chosenSeat += "e7, ";
                break;
            case R.id.e8:
                Button e8 = v.findViewById(R.id.e8);
                e8.setBackgroundColor(Color.WHITE);
                chosenSeat += "e8, ";
                break;
            case R.id.e9:
                Button e9 = v.findViewById(R.id.e9);
                e9.setBackgroundColor(Color.WHITE);
                chosenSeat += "e9, ";
                break;
            case R.id.f1:
                Button f1 = v.findViewById(R.id.f1);
                f1.setBackgroundColor(Color.WHITE);
                chosenSeat += "f1, ";
                break;
            case R.id.f2:
                Button f2 = v.findViewById(R.id.f2);
                f2.setBackgroundColor(Color.WHITE);
                chosenSeat += "f2, ";
                break;
            case R.id.f3:
                Button f3 = v.findViewById(R.id.f3);
                f3.setBackgroundColor(Color.WHITE);
                chosenSeat += "f3, ";
                break;
            case R.id.f4:
                Button f4 = v.findViewById(R.id.f4);
                f4.setBackgroundColor(Color.WHITE);
                chosenSeat += "f4, ";
                break;
            case R.id.f5:
                Button f5 = v.findViewById(R.id.f5);
                f5.setBackgroundColor(Color.WHITE);
                chosenSeat += "f5, ";
                break;
            case R.id.f6:
                Button f6 = v.findViewById(R.id.f6);
                f6.setBackgroundColor(Color.WHITE);
                chosenSeat += "f6, ";
                break;
            case R.id.f7:
                Button f7 = v.findViewById(R.id.f7);
                f7.setBackgroundColor(Color.WHITE);
                chosenSeat += "f7, ";
                break;
            case R.id.f8:
                Button f8 = v.findViewById(R.id.f8);
                f8.setBackgroundColor(Color.WHITE);
                chosenSeat += "f8, ";
                break;
            case R.id.f9:
                Button f9 = v.findViewById(R.id.f9);
                f9.setBackgroundColor(Color.WHITE);
                chosenSeat += "f9, ";
                break;
            default:
                break;
        }
    }
}
