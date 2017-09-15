package com.example.kenneth.estacionamiento_upra;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.TimerTask;
import java.util.Timer;

public class Main extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 3200;
    Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                    Intent mainIntent = new Intent().setClass(Main.this, HomeActivity.class);
                    startActivity(mainIntent);
                    finish();
            }
        };



        ImageView icon = (ImageView)findViewById(R.id.imageView);
    // This is where the icon picture is been animated, it will expand and rotate
        icon.animate()
                .scaleX(1.5f)
                .scaleY(1.5f)
                .rotationBy(720)
                .setDuration(2000); //2 second duration
        // Simulate a long loading process on application startup.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);

    }
}


