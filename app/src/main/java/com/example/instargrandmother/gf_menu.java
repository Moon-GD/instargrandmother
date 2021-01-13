package com.example.instargrandmother;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gf_menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gf_menu);

        Button previous = (Button) findViewById(R.id.previous_gf);
        Button weather = (Button) findViewById(R.id.button_weather_gf);
        Button news = (Button) findViewById(R.id.button_news_gf);

        previous.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                Intent intent_weather = getPackageManager().getLaunchIntentForPackage("com.lifeoverflow.app.weather");
                startActivity(intent_weather);
                }
                catch(Exception e){
                    Intent marketLaunch = new Intent(Intent.ACTION_VIEW);
                    marketLaunch.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lifeoverflow.app.weather"));
                    startActivity(marketLaunch);
                }
            }
        });

        news.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent naver_news_site = new Intent(Intent.ACTION_VIEW);
                naver_news_site.setData(Uri.parse("https://news.naver.com/"));
                startActivity(naver_news_site);
            }
        });
    }
}
