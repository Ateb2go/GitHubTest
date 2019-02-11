package com.ateb2go.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Babuyai");
        //좋아요yee

        //추가작업
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
