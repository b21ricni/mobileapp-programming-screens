package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button goback;

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
        Log.d("==>", "MA2onCreate");
        goback = findViewById(R.id.GoBackButton);

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Go Back pressed");
            }
        });

    }
}