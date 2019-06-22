package com.kurio.daggerguide.model;

import android.util.Log;

import com.kurio.daggerguide.repo.Engine;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Override
    public void start() {
        Log.i(TAG,"START");
    }
}
