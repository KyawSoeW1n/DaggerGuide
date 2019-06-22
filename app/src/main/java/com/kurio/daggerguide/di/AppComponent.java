package com.kurio.daggerguide.di;


import android.app.Application;

import com.kurio.daggerguide.App;
import com.kurio.daggerguide.activity.MainActivity;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class, WheelModule.class})
public interface AppComponent extends AndroidInjector<App> {

    void inject(App app);


    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(MainActivity mainActivity);

}
