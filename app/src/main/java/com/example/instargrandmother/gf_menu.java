package com.example.instargrandmother;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class gf_menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gf_menu);

        Button previous = (Button) findViewById(R.id.previous_gf);
        Button music = (Button) findViewById(R.id.button_music_gf);

        previous.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        music.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),gf_music.class);
                startActivity(intent);
            }
        }));
    }
}
