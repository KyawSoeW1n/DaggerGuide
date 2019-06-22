package com.kurio.daggerguide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kurio.daggerguide.R;
import com.kurio.daggerguide.model.Car;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {
    @Inject
    public Car car;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidInjection.inject(this);
        tv1 = findViewById(R.id.tv1);
        tv1.setText(car.drive());
    }
}
