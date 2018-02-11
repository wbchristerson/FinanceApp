package com.example.android.financeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Start Of Tests */
    <TextView
            android:text="Hi There"
            android:layout_width="wrap_content"
            android:layout_height="300dp"
            android:backgroundColor="@android:color/green"
            android:textColor="@android:color/black" />
    /* End Of Tests */
}
