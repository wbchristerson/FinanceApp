package com.example.android.financeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int timer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button infoButton = (Button) findViewById(R.id.info_button);

        infoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent infoIntent = new Intent(MainActivity.this, Information.class);
                startActivity(infoIntent);
            }
        });
    }

    public void displayTicker(int time) {
        TextView timeView = (TextView) findViewById(R.id.timer);
        timeView.setText(String.valueOf(time));
    }

    public void incrementDisplay(View view) {
        timer += 1;
        displayTicker(timer);
    }
}
