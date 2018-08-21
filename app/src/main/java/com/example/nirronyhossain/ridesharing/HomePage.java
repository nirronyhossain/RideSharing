package com.example.nirronyhossain.ridesharing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }


    public void biker_Profile_1(View view) {

        Intent intent = new Intent(HomePage.this, RiderProfile.class);
        startActivity(intent);
    }
}
