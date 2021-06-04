package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout;
    Button btnBooks;
    Button btnCalendar;
    Button btnMenu;
    Button btnMentor;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLogout = findViewById(R.id.logout);
        btnBooks = findViewById(R.id.button);
        btnMenu = findViewById(R.id.button3);
        btnCalendar = (Button) findViewById(R.id.button4);
        btnMentor= findViewById(R.id.button2);

        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToCalendar = new Intent(HomeActivity.this, EventsActivity.class);
                startActivity(intToCalendar);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intToMain);
            }
        });

        btnBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToBooks = new Intent(HomeActivity.this, BooksPortal.class);
                startActivity(intToBooks);
            }
        });



        Intent incoming = getIntent();

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMenu = new Intent(HomeActivity.this, MenuActivity.class);
                startActivity(intToMenu);
            }
        });

        btnMentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMentor = new Intent(HomeActivity.this, MentorHome.class);
                startActivity(intToMentor);
            }
        });


    }
}