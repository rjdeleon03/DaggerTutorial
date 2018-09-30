package com.rjdeleon.daggertutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.rjdeleon.daggertutorial.tutorial_part1.model.BattleOfBastards;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    Retrofit retrofit;
    RecyclerView reyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
