package com.example.aportillo.daggerexample.Models;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class SystemModule {

    private final Application application;

    public SystemModule(Application application) {
        this.application = application;
    }

    @Provides
    Context provideContext(){
        return application;
    }


  /*   @Singleton
    @Provides
    SharedPreferences providePreferenceManager() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

   @Singleton
    @Provides
    ConnectivityManager provideConnectivityManager() {
        return (ConnectivityManager) application.getSystemService(Context.CONNECTIVITY_SERVICE);
    }*/



}
