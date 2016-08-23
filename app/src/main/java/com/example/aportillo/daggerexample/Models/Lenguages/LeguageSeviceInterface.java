package com.example.aportillo.daggerexample.Models.Lenguages;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by aportillo on 18/08/2016.
 */
public interface LeguageSeviceInterface {

    @GET("3rorv")
    Call<Lenguages> getLenguages();
}
