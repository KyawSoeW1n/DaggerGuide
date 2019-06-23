package com.kurio.daggerguide.model;

import android.util.Log;

import com.kurio.daggerguide.repo.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.i(TAG, "START. HorsePower" + horsePower);
    }
}
