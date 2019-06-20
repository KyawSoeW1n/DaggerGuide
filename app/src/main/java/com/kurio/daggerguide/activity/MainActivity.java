package com.kurio.daggerguide.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kurio.daggerguide.R;
import com.kurio.daggerguide.di.AppComponent;
import com.kurio.daggerguide.model.Car;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.DaggerActivity;
import dagger.android.DaggerApplication;

public class MainActivity extends AppCompatActivity {
    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidInjection.inject(this);
        car.drive();
    }
}
