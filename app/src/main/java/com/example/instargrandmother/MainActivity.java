package com.example.instargrandmother;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        
        toolbar.setTitleTextColor(Color.BLUE);
        //toolbar.setNavigationIcon(R.mipmap.ic_launcher_instargrandmother_round);
    }
}