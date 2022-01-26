package com.example.alarmclockbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    private Button setAlarm, manageTime;
    private TextView timeV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        // go to setalarm
        setAlarm = (Button) findViewById(R.id.setAlarm);
        setAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSetA = new Intent(MainActivity.this, SetAlarmActivity.class);
                startActivity(toSetA);
            }
        });

        // go to managetime
        manageTime = (Button) findViewById(R.id.manageTime);
        manageTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toManageT = new Intent(MainActivity.this, ManageTimeActivity.class);
                startActivity(toManageT);
            }
        });

    }
}