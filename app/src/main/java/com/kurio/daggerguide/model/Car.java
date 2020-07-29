package com.kurio.daggerguide.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public String driveCar() {
        return "Car is driving";
    }
}
