package com.example.instargrandmother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ib_gf = (ImageButton) findViewById(R.id.imageButton);
        ib_gf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), gf_menu.class);
                startActivity(intent);
            }
        });

        ImageButton ib_gm = (ImageButton) findViewById(R.id.imageButton2);
        ib_gm.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), gm_menu.class);
                startActivity(intent);
            }
        });

    }
}