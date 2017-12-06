package com.example.kenneth.estacionamiento_upra;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.kenneth.estacionamiento_upra.R;

public class HomeActivity extends AppCompatActivity {


    public void onClickZone(View V){

        Intent mainIntent = new Intent().setClass(HomeActivity.this, Zona.class);
        startActivity(mainIntent);
    };

    public void onClickZone2(View V){

        Intent mainIntent = new Intent().setClass(HomeActivity.this, Zona2.class);
        startActivity(mainIntent);
    };

    public void onClickZone3(View V){

        Intent mainIntent = new Intent().setClass(HomeActivity.this, Zona3.class);
        startActivity(mainIntent);
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove the tittlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
    }
}

