package com.example.aportillo.daggerexample.Component;

import com.example.aportillo.daggerexample.Model.Vehicle;
import com.example.aportillo.daggerexample.Module.VehicleModule;

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
