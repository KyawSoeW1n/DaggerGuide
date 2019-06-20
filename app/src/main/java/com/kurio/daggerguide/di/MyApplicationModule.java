package com.kurio.daggerguide.di;


import com.kurio.daggerguide.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}