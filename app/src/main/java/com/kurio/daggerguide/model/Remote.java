package com.kurio.daggerguide.model;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private String TAG = getClass().getSimpleName();

    @Inject
    public Remote() {

    }

    public void openCarLock(Car car) {
        Log.i(TAG, "Open Car Lock");
    }
}
