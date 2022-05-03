package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signin;

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
        Log.d("==>", "onCreate");

        signin = findViewById(R.id.SignInButton);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "onClick");
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
