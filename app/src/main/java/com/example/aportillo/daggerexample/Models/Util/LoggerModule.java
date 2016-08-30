package com.example.aportillo.daggerexample.Models.Util;

import com.example.aportillo.daggerexample.Util.Logger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aportillo on 24/08/2016.
 */
@Module
public class LoggerModule {

    public LoggerModule() {
    }

    @Provides
    @Singleton
    Logger provideLogger(){
        return new Logger();
    }


}
