package com.example.aportillo.daggerexample.Models.Util;

import com.example.aportillo.daggerexample.Models.Lenguages.LeguageSeviceInterface;
import com.example.aportillo.daggerexample.Services.ServiceGenerator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by aportillo on 30/08/2016.
 */
@Module
public class ServiceGeneratorModule {

    @Provides
    @Singleton
    ServiceGenerator provideServiceGenerator() {
        return new ServiceGenerator();
    }

    @Provides
    @Singleton
    LeguageSeviceInterface provideLenguageServiceInterface(Retrofit retrofit) {
        return retrofit.create(LeguageSeviceInterface.class);
    }

}
