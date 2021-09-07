package com.example.crofert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
    }

    public void Notification(View view) {
        Intent intent=new Intent(getApplicationContext(),NotificationActivity.class);
        startActivity(intent);
    }

    public void Weather(View view) {
        Intent intent=new Intent(getApplicationContext(),WeatherActivity.class);
        startActivity(intent);
    }

    public void About_Crop(View view) {
        Intent intent=new Intent(getApplicationContext(),AboutCropActivity.class);
        startActivity(intent);
    }

    public void MSP(View view) {

        Intent intent=new Intent(getApplicationContext(),MSPActivity.class);
        startActivity(intent);
    }
}