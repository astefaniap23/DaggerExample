package com.example.aportillo.daggerexample.Services;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseService {

    private String baseUrl="http://myjson.com/vw77/";
    private Retrofit retrofit;

    public BaseService() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(this.getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public void setRetrofit(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

}



