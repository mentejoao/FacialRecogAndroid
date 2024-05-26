package com.example.facialrecogandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.facialrecogandroid.FaceTimeActivity;
import com.example.facialrecogandroid.R;
import com.example.facialrecogandroid.RecognitionActivity;
import com.example.facialrecogandroid.RegisterActivity;
import com.example.facialrecogandroid.face_recognition.FaceClassifier;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {


    public static HashMap<String, FaceClassifier.Recognition> registered = new HashMap<>();
    Button registerBtn, recognizeBtn, faceTimeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerBtn = findViewById(R.id.buttonregister);
        recognizeBtn = findViewById(R.id.buttonrecognize);
        faceTimeBtn = findViewById(R.id.buttonfacetime);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        recognizeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RecognitionActivity.class));
            }
        });

        faceTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FaceTimeActivity.class));
            }
        });

    }
}