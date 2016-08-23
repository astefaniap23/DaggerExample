package com.example.aportillo.daggerexample.Models.Lenguages;

import com.example.aportillo.daggerexample.Services.LenguagesServices;

import dagger.Module;

/**
 * Created by aportillo on 23/08/2016.
 */
@Module
public class LenguageServiceModule {

    private LenguagesServices lenguagesServices;

    LenguagesServices providerLenguages( ){
        return new LenguagesServices();
    }
}