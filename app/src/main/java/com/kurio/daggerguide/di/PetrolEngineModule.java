package com.kurio.daggerguide.di;

import com.kurio.daggerguide.model.PetrolEngine;
import com.kurio.daggerguide.repo.Engine;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {
    private int horsePower;
    private int capacit;


    @Inject
    public PetrolEngineModule(int horsePower,
                              int capacit) {
        this.horsePower = horsePower;
        this.capacit = capacit;
    }

    @Provides
    @Named("horsePower")
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    @Named("capacity")
    int provideCapacity() {
        return capacit;
    }

    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
}
