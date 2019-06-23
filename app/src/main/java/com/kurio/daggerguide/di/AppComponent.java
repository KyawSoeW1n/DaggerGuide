package com.kurio.daggerguide.di;


import android.app.Application;

import com.kurio.daggerguide.App;
import com.kurio.daggerguide.activity.MainActivity;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class, WheelModule.class, PetrolEngineModule.class})
public interface AppComponent extends AndroidInjector<App> {

    void inject(App app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        Builder diselEngineModule(PetrolEngineModule petrolEngineModule);

//        @BindsInstance
//        Builder horsePower(@Named("horsePower") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("capacity") int capacity);

        AppComponent build();
    }

    void inject(MainActivity mainActivity);

}
