package com.example.yeartwoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }

    public void onClickShowBroadcast(View view) {
        EditText st = findViewById(R.id.textMsg);
        Intent intent = new Intent();
        intent.putExtra("msg", (CharSequence) st.getText().toString());
        intent.setAction("com.example.yeartwoproject.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
