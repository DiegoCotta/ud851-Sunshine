package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    TextView mWeatherDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mWeatherDetails = (TextView) findViewById(R.id.tv_weather_details);
        if (getIntent() != null && getIntent().hasExtra(Intent.EXTRA_TEXT)) {
            mWeatherDetails.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}