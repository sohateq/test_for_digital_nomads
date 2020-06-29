package com.akameko.testfordigitalnomads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        startApp();
    }

    private void startApp(){
        setTheme(R.style.AppTheme);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
