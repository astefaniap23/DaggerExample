package com.example.aportillo.daggerexample.Models.Util;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by aportillo on 30/08/2016.
 */
@Module
public class NetModule {
    public NetModule( ) {

    }

    Retrofit retrofit;
    private String baseUrl = "https://api.myjson.com/bins/";

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(this.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
