package com.hixman.first_architecturepattern.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hixman.first_architecturepattern.model.MVC_model;
import com.hixman.first_architecturepattern.R;

// this is how MVC works in a simple way,
// it's main that the MainActivity is the controller and you have to do everything yourself
/**
 * MVC:
 * M:model      ==> MVC_model
 * V:view       ==> tv_data
 * C:controller ==> MainActivity
 * */

public class MainActivity extends AppCompatActivity {

    TextView tv_data ;
    Button btn_getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here we find and define our views
        tv_data= findViewById(R.id.tv_data);
        btn_getData= findViewById(R.id.btn_getdata);

    }
    public MVC_model getDataFromDataBase(){
        return new MVC_model("hix coder","15/1/2020","hello everyone",1);
    }

    public void Buttons_mainActivity(View view) {
        if (btn_getData.equals(view))
            tv_data.setText(getDataFromDataBase().getName());

    }
}