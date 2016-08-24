package com.example.aportillo.daggerexample.Util;

import android.util.Log;

/**
 * Created by aportillo on 22/08/2016.
 */
public class Logger {

    public Logger() {
    }

    private final String TAG = "CoreLog";

    public void log(String text) {
        Log.d(TAG, text);
    }

    public void logE (Class nameClas,String msg){
        Log.e(nameClas.getSimpleName(),msg);
    }
    public void logI (Class nameClas,String msg){
        Log.i(nameClas.getSimpleName(),msg);
    }
    public void logV (Class nameClas,String msg){
        Log.v(nameClas.getSimpleName(),msg);
    }
    public void logW (Class nameClas,String msg){
        Log.w(nameClas.getSimpleName(),msg);
    }

}