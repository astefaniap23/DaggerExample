package com.example.aportillo.daggerexample.Module;

import com.example.aportillo.daggerexample.Model.Motor;
import com.example.aportillo.daggerexample.Model.Vehicle;

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
