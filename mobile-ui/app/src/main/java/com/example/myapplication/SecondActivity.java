package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity
        extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    public void onClick(final View v) {
        if (v.getId() == R.id.previousButton) {
            /* Write the code to go to the main activity */
        }
        else if (v.getId() == R.id.nextButton) {
            /*Write code to:
            1) the next page (third activity), and
            2) send username to the third activity*/
        }
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.previousButton).setOnClickListener(this);
        findViewById(R.id.nextButton).setOnClickListener(this);
    }
}
