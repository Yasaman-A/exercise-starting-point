package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity
        extends AppCompatActivity
        implements View.OnClickListener {
    @Override
    public void onClick(final View v) {
        if (v.getId() == R.id.preButton) {
            // Write the code to go to the second activity
        }
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViewById(R.id.preButton).setOnClickListener(this);
        /* Write the code to extract the username from the budle
        and show it on the screen.
         */
    }
}
