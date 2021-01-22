package com.example.yeartwoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class lecturers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturers);

        TextView textView=findViewById(R.id.textView2);
        AssetManager assetManager = getAssets();
        InputStream files;

        {
            try{
                files= assetManager.open("codezone.c");

            } catch (IOException e){
                e.printStackTrace();
            }

        }

        ListView listView = findViewById(R.id.lecturerList);
        ArrayList<String> lecturerList = new ArrayList<>();
        lecturerList.add("Ambrose");
        lecturerList.add("Kimera");
        lecturerList.add("Mwavu");
        lecturerList.add("mary");
        lecturerList.add("esther");
        lecturerList.add("susan");
        lecturerList.add("opus");
        lecturerList.add("morren");
        lecturerList.add("nakato");
        lecturerList.add("musimenta");
        lecturerList.add("wilson");
        lecturerList.add("baguma");
        lecturerList.add("atwaru");
        lecturerList.add("safari");
        lecturerList.add("faith");

        ArrayAdapter<String> lecturerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lecturerList);
        listView.setAdapter(lecturerAdapter);


    }


    
}
