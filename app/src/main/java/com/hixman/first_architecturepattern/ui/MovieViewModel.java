package com.hixman.first_architecturepattern.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hixman.first_architecturepattern.model.MovieModel;

// the job of this class is just bring the dataname from the the dataBase ;
// and say that he fetch the data name that we want.

public class MovieViewModel extends ViewModel {
//    LiveData<String> mvvm_name_LiveData;    // we don't need it yet
    MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();


    private MovieModel getMovieFromDataBase(){
        return new MovieModel("hix coder","15/1/2020","hello everyone",1);
    }

    // here we fetch the name and give it to MutableLiveData var
    public void getMovie_name(){
        String MVVM_name = getMovieFromDataBase().getName();
        movieNameMutableLiveData.setValue(MVVM_name);
    }
}
