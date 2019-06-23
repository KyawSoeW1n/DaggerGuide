package com.kurio.daggerguide;

import android.app.Activity;
import android.app.Application;

import com.kurio.daggerguide.di.DaggerAppComponent;
import com.kurio.daggerguide.di.DieselEngineModule;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {
    @Inject
    public DispatchingAndroidInjector<Activity> androidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder()
                .application(this)
                .diselEngineModule(new DieselEngineModule(100))
                .build()
                .inject(this);
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return androidInjector;
    }
}
