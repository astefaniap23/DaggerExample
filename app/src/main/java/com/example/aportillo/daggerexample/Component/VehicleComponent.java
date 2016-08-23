package com.example.aportillo.daggerexample.Component;


import com.example.aportillo.daggerexample.Models.Vehicle.Vehicle;
import com.example.aportillo.daggerexample.Models.Vehicle.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aportillo on 16/08/2016.
 */
@Singleton
@Component (modules = VehicleModule.class)
public interface VehicleComponent {

    Vehicle provideVehicle();

}
