package com.kurio.daggerguide.di;


import android.app.Application;

import com.kurio.daggerguide.App;
import com.kurio.daggerguide.activity.MainActivity;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = { AndroidInjectionModule.class, MyApplicationModule.class})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        public Builder application(Application application);

        public AppComponent build();
    }

    void inject(MainActivity mainActivity);

}
