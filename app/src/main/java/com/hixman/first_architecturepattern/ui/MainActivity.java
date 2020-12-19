package com.hixman.first_architecturepattern.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hixman.first_architecturepattern.R;

// this is how MVP works in a simple way,
// here the MainActivity is responsible about handling the UI; it have no relation with the model
/**
 * MVVM:
 * M:model      ==> MovieModel
 * V:view       ==> tv_data
 * */

public class MainActivity extends AppCompatActivity{

    TextView tv_data ;
    Button btn_getData;
    MovieViewModel movie_viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // here we find and define our views
        tv_data    = findViewById(R.id.tv_data);
        btn_getData= findViewById(R.id.btn_getdata);

        movie_viewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movie_viewModel.movieNameMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tv_data.setText(s);
            }
        });


    }


    public void Buttons_mainActivity(View view) {
        if (btn_getData.equals(view))
            movie_viewModel.getMovie_name();

    }



}