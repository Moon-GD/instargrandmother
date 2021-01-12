package com.example.instargrandmother;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gm_music extends AppCompatActivity {

    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gm_music);

        Button previous = findViewById(R.id.previous_gm_music);
        Button play_youngtak = findViewById(R.id.play_youngtak);
        Button stop_youngtak = findViewById(R.id.stop_youngtak);
        Button play_leechanwon = findViewById(R.id.play_leechanwon);
        Button stop_leechanwon = findViewById(R.id.stop_leechanwon);
        Button play_kimhojoong = findViewById(R.id.play_kimhojoong);
        Button stop_kimhojoong = findViewById(R.id.stop_kimhojoong);
        Button play_limyoungwoong = findViewById(R.id.play_limyoungwoong);
        Button stop_limyoungwoong = findViewById(R.id.stop_limyoungwoong);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m != null){
                    m.stop();
                    m.release();
                    m = null;
                }
                Intent intent = new Intent(getApplicationContext(), gm_menu.class);
                startActivity(intent);
            }
        });


        // play 버튼 //

        play_youngtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m != null)
                {
                    m.stop();
                    m.release();
                    m = null;
                }
                m = MediaPlayer.create(gm_music.this , R.raw.jjin);
                m.start();
                m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp)
                    {
                        mp.stop();
                        mp.release();
                    }
                });
            }
        });

        play_leechanwon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(m != null)
                {
                    m.stop();
                    m.release();
                    m = null;
                }
                m = MediaPlayer.create(gm_music.this,R.raw.jinddobbaegi);
                m.start();
                m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp)
                    {
                        mp.stop();
                        mp.release();
                    }
                });
            }
        });

        play_kimhojoong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(m != null)
                {
                    m.stop();
                    m.release();
                    m = null;
                }
                m = MediaPlayer.create(gm_music.this,R.raw.kimhojoong);
                m.start();
                m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp)
                    {
                        mp.stop();
                        mp.release();
                    }
                });
            }
        });

        play_limyoungwoong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(m != null)
                {
                    m.stop();
                    m.release();
                    m = null;
                }
                m = MediaPlayer.create(gm_music.this,R.raw.limyoungwoong);
                m.start();
                m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp)
                    {
                        mp.stop();
                        mp.release();
                    }
                });
            }
        });

        // 아래부터는 stop 버튼 //

        stop_youngtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    m.stop();
            }
        });

        stop_leechanwon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                m.stop();
            }
        });
        stop_kimhojoong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                m.stop();
            }
        });
        stop_limyoungwoong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                m.stop();
            }
        });
    }
}