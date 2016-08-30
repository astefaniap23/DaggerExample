package com.example.aportillo.daggerexample.Component;

import com.example.aportillo.daggerexample.Models.Util.LoggerModule;
import com.example.aportillo.daggerexample.Services.ServiceGenerator;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aportillo on 29/08/2016.
 */
@Singleton
@Component(modules = {LoggerModule.class})
public interface LoggerComponent {
    void inject(ServiceGenerator serviceGenerator);
}
