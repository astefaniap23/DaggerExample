package com.example.aportillo.daggerexample.Models.Main;

import com.example.aportillo.daggerexample.Services.LenguagesServices;
import com.example.aportillo.daggerexample.Services.ServiceGenerator;
import com.example.aportillo.daggerexample.Util.Logger;
import com.example.aportillo.daggerexample.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aportillo on 22/08/2016.
 */
@Module
public class MainModule {

    public MainModule() {

    }

    @Provides
    @Singleton
    MainActivity provideMainActivity() {
        return new MainActivity();
    }

    @Provides
    @Singleton
    LenguagesServices provideLenguagesServices() {
        return new LenguagesServices();
    }

    @Provides
    @Singleton
    ServiceGenerator provideServiceGenerator() {
        return new ServiceGenerator();
    }

    @Provides
    @Singleton
    Logger providerLogger(){
        Logger logger = new Logger();
        return logger;
    }

}
