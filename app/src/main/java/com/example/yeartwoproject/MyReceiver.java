package com.example.yeartwoproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        CharSequence iData = intent.getCharSequenceExtra("msg");
        Toast.makeText(context,"Received Message: "+iData,Toast.LENGTH_LONG).show();
    }
}
