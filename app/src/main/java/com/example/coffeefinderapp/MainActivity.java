package com.example.coffeefinderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] coffee={"iVibe Coffee", "Caribou Coffee", "Dunkin Donuts", "Starbucks"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, coffee));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, iVibe.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, caribou.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, dunkin.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, starbucks.class));
                break;
        }
    }
}
