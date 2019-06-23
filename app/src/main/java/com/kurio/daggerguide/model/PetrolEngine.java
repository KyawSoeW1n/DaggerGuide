package com.kurio.daggerguide.model;

import android.util.Log;

import com.kurio.daggerguide.repo.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";
    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower,
                        @Named("capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.i(TAG, "START.HP" + horsePower + "\t" + "Engine Capacity" + engineCapacity);

    }
}
