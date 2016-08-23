package com.example.aportillo.daggerexample.Util;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by aportillo on 22/08/2016.
 */
public class Logger {

    @Inject
    public Logger() {
    }

    private final String TAG = "CoreLog";

    public void log(String text) {
        Log.d(TAG, text);
    }

}