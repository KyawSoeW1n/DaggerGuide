package com.kurio.daggerguide.di;

import com.kurio.daggerguide.model.DieselEngine;
import com.kurio.daggerguide.repo.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    //    @Inject
    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
