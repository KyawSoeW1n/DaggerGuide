package com.kurio.daggerguide.model;

import com.kurio.daggerguide.repo.Engine;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Inject
    public void openCarLock(Remote remote) {
        remote.openCarLock(this);
    }

    public String drive() {
        engine.start();
        return "Car is driving";
    }
}
