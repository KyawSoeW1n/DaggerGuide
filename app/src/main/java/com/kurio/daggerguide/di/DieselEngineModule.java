package com.kurio.daggerguide.di;

import com.kurio.daggerguide.model.DieselEngine;
import com.kurio.daggerguide.repo.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine dieselEngine);
}
