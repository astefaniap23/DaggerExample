package com.example.aportillo.daggerexample.Component;

import com.example.aportillo.daggerexample.Models.Util.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by aportillo on 30/08/2016.
 */
@Singleton
@Component(modules = {NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
