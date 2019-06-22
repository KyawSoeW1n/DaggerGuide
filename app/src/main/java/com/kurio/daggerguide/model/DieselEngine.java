package com.kurio.daggerguide.model;

import android.util.Log;

import com.kurio.daggerguide.repo.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    @Inject
    public DieselEngine() {

    }

    @Override
    public void start() {
        Log.i(TAG, "START");
    }
}
