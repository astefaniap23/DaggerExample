package com.example.aportillo.daggerexample.Services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by aportillo on 18/08/2016.
 */

public class BaseServices {

    private Retrofit retrofit;
    private String baseUrl="http://myjson.com/vw77/";


    public BaseServices() {
        this.baseUrl = baseUrl;


        this.retrofit = new Retrofit.Builder()
                .baseUrl(this.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public Retrofit getRetrofit() {
        return retrofit;
    }

    public void setRetrofit(Retrofit retrofit) {
        this.retrofit = retrofit;
    }
}

