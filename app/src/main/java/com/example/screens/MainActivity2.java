package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    public MainActivity2(){
        super();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","MA2 Resumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","MA2 Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","MA2 Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>","MA2 Destroyed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}