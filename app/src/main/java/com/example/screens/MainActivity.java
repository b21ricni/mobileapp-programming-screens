package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button signin;
    private EditText name;

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

        name = findViewById(R.id.SignInName);

        signin = findViewById(R.id.SignInButton);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "onClick");
                Log.d("==>", "name: "+name.getText().toString());
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name.getText().toString());
                startActivity(intent);
            }
        });
    }
}
