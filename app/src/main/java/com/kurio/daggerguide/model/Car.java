package com.kurio.daggerguide.model;

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
        return "Car is driving";
    }
}
