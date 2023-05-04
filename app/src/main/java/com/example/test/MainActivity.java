package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.test.Fragment.first;
import com.example.test.Fragment.second;
import com.example.test.Fragment.third;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
    }

    public void frame1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new first()).commit();
    }

    public void frame2(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new second()).commit();
    }

    public void frame3(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new third()).commit();
    }
}