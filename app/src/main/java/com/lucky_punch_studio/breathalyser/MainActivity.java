package com.lucky_punch_studio.breathalyser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCalculateActivity(View view) {
        intent = new Intent(this, CalculationActivity.class);
        startActivity(intent);
    }

    public void showPersonProperties(View view) {
        intent = new Intent(this, PersonPropertiesActivity.class);
        startActivity(intent);
    }

    public void showAbout(View view) {
        intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}