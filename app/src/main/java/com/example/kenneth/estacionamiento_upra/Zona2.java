package com.example.kenneth.estacionamiento_upra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Set;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class Zona2 extends AppCompatActivity {
    public String color = "green";
    public ImageView luz0, luz1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona2);
    }
    public void setGreen()
    {
        luz0 = (ImageView) findViewById(R.id.imageLight);
        luz1 = (ImageView) findViewById(R.id.imageLight1);
        luz0.setImageResource(R.drawable.greenlight);
        luz1.setImageResource(R.drawable.greenlight);
        color = "green";
    }
    public void setRed()
    {
        luz0 = (ImageView) findViewById(R.id.imageLight);
        luz1 = (ImageView) findViewById(R.id.imageLight1);
        luz0.setImageResource(R.drawable.redlight);
        luz1.setImageResource(R.drawable.redlight);
        color = "red";
    }
    public void onClickLigth(View v)
    {
        if (color == "green")
        {
            setRed();
        }
        else if (color == "red")
        {
            setGreen();
        }
    }
}
