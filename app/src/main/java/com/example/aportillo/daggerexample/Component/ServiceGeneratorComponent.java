package com.example.aportillo.daggerexample.Component;

import com.example.aportillo.daggerexample.Models.Util.NetModule;
import com.example.aportillo.daggerexample.Models.Util.ServiceGeneratorModule;
import com.example.aportillo.daggerexample.Services.LenguagesServices;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aportillo on 30/08/2016.
 */
@Singleton
@Component(modules = {ServiceGeneratorModule.class, NetModule.class})
public interface ServiceGeneratorComponent {

    void inject(LenguagesServices lenguagesServices);
}
