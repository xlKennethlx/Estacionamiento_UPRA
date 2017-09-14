package com.example.kenneth.estacionamiento_upra;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import java.util.TimerTask;
import java.util.Timer;

public class Main extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 2500;
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
        // Simulate a long loading process on application startup.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);

    }
}


