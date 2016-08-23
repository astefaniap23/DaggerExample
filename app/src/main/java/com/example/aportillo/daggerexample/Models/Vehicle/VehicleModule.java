package com.example.aportillo.daggerexample.Models.Vehicle;


import com.example.aportillo.daggerexample.Models.Motor.Motor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aportillo on 16/08/2016.
 */

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor providerMotor(){
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle providerVehicle(){
        return new Vehicle(new Motor());
    }
}
