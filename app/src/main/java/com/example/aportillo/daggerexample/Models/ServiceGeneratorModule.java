package com.example.aportillo.daggerexample.Models;

import com.example.aportillo.daggerexample.Services.ServiceGenerator;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aportillo on 23/08/2016.
 */
@Module
public class ServiceGeneratorModule {

    @Provides
    public ServiceGenerator providerLogger() {
        return new ServiceGenerator();
    }

  /*  @Provides
    public Logger providerLogger(){
        return new Logger();
    }

    @Provides
    public Constans providerConstans(){
        return new Constans();
    }*/
}