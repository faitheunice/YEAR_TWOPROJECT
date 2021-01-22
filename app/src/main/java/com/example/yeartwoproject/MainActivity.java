package com.example.yeartwoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);

        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_students) {
            Intent myintent = new Intent(this, student.class);
            this.startActivity(myintent);
            return true;
        }

        if (id == R.id.menu_regnumber) {
            Intent myintent = new Intent(this, lecturers.class);
            this.startActivity(myintent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        EditText message = findViewById(R.id.message);
        Toast.makeText(this, "Sending Message......" + message.getText().toString(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("MESSAGE", message.getText().toString());
        startActivity(intent);

    }


}
