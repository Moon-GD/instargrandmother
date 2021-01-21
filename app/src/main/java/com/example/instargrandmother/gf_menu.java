package com.example.instargrandmother;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gf_menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gf_menu);

        Button previous = findViewById(R.id.previous_gf);
        Button weather = findViewById(R.id.button_weather_gf);
        Button news = findViewById(R.id.button_news_gf);

        previous.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        weather.setOnClickListener(v -> {
            if(checkinstallapp("com.lifeoverflow.app.weather")) {
                Intent intent_weather = getPackageManager().getLaunchIntentForPackage("com.lifeoverflow.app.weather");
                startActivity(intent_weather);
            }
            else {
                Intent marketLaunch = new Intent(Intent.ACTION_VIEW);
                marketLaunch.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lifeoverflow.app.weather"));
                startActivity(marketLaunch);
            }
        });

        news.setOnClickListener(v -> {
            Intent daum_news_site = new Intent(Intent.ACTION_VIEW);
            daum_news_site.setData(Uri.parse("https://news.daum.net/"));
            startActivity(daum_news_site);
        });
    }

    private boolean checkinstallapp(String packagename){
        Intent intent = getPackageManager().getLaunchIntentForPackage(packagename);
        if(intent==null){
            return false;
        }
        else
            return true;
    }
}
