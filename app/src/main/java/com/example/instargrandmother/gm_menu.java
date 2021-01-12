package com.example.instargrandmother;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.instargrandmother.R;

public class gm_menu extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.gm_menu);

            Button previous = (Button) findViewById(R.id.previous_gm);
            Button music = (Button) findViewById(R.id.button_music_gm);
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
                    Intent intent = new Intent (getApplicationContext(),gm_music.class);
                    startActivity(intent);
                }
            }));
        }
}
