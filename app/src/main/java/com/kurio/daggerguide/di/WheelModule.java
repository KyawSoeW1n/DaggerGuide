package com.kurio.daggerguide.di;

import com.kurio.daggerguide.model.Rim;
import com.kurio.daggerguide.model.Tire;
import com.kurio.daggerguide.model.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {
    @Provides
    static Rim provideRim() {
        return new Rim();
    }

    @Provides
    static Tire provideTire() {
        Tire tire = new Tire();
        tire.inflateTire();
        return tire;
    }

    @Provides
    static Wheel provideWheel(Rim rim,Tire tire){
        return new Wheel(rim,tire);
    }
}
