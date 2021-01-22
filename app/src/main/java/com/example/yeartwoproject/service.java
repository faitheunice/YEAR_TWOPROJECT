package com.example.yeartwoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }


    public void startService(View view) {
        startService(new Intent(this, service2.class));
    }

    public void stopService(View view) {
        stopService(new Intent(this, service2.class));
    }

}
