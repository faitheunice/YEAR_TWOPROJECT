package com.example.yeartwoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        String message= getIntent().getStringExtra("MESSAGE");
        TextView messageView = findViewById(R.id.messageTextView);
        messageView.setText(message);



    }
    public  void onClose(View view){
        super.finish();
    }
}
