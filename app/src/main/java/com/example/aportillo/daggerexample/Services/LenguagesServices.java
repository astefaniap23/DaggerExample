package com.example.aportillo.daggerexample.Services;

import android.util.Log;

import com.example.aportillo.daggerexample.Models.Lenguages.LeguageSeviceInterface;
import com.example.aportillo.daggerexample.Models.ServiceInterface;

import javax.inject.Inject;

import retrofit2.Call;

/**
 * Created by aportillo on 18/08/2016.
 */
public class LenguagesServices<T> extends BaseServices {

    private LeguageSeviceInterface languageSeviceInterface;

    @Inject
    public ServiceGenerator serviceGenerator;

    @Inject
    public LenguagesServices() {
        super();
        this.languageSeviceInterface = getRetrofit().create(LeguageSeviceInterface.class);
    }

    public void getLanguageServicesI(ServiceInterface<T> serviceInterface, T t) throws Exception {
        try {
            serviceGenerator = new ServiceGenerator();
            this.languageSeviceInterface = getRetrofit().create(LeguageSeviceInterface.class);
            Call<T> aCall = (Call<T>) this.languageSeviceInterface.getLenguages();
            serviceGenerator.response(aCall, serviceInterface);
        } catch (Exception e) {
            Log.e("Error", getClass().getSimpleName() + ":" + e.getMessage());
        }
    }
}
