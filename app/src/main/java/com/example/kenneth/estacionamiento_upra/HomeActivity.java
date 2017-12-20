package com.example.kenneth.estacionamiento_upra;


import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kenneth.estacionamiento_upra.R;

import java.util.ArrayList;
import java.util.Set;

public class HomeActivity extends AppCompatActivity {
    volatile boolean stopWorker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove the tittlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
        visible();
    }

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

//    public void enableBlue() {
//        BA = BluetoothAdapter.getDefaultAdapter();
//        Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//        startActivityForResult(turnOn, 0);
//    }

    public  void visible(){
        Intent getVisible = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(getVisible, 0);

    }

}

