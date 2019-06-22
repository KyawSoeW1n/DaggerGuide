package com.kurio.daggerguide.model;

import android.util.Log;

public class Tire {
    private String TAG = getClass().getSimpleName();
    //we don't own this class

    public void inflateTire() {
        Log.i(TAG, "Inflate Tire");
    }
}
