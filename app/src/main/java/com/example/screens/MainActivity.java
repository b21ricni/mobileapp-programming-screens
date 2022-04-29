package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","onPostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>","OnDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
