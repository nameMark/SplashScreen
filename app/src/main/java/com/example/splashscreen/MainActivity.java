package com.example.splashscreen;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    boolean shouldStart =true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Handler handler = new Handler();

        handler.postDelayed(run,3000);
    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            if(shouldStart = true) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        }
    };

    @Override
    protected void onPause() {
        shouldStart = false;
        super.onPause();
        this.finish();
    }
}
