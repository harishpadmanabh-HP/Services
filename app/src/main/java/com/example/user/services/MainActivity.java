package com.example.user.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button startbt, stopbt;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbt = (Button) findViewById(R.id.startbuttton);
        stopbt = (Button) findViewById((R.id.stopbutton));

        startbt.setOnClickListener(this);
        stopbt.setOnClickListener(this);
    }

        public void onClick(View view) {
            if (view == startbt) {
                //starting service
                startService(new Intent(this, MyServices.class));
            } else if (view == stopbt) {
                //stopping service
                stopService(new Intent(this, MyServices.class));
            }
        }
    }
