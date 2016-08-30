package com.example.aportillo.daggerexample.Services;


import com.example.aportillo.daggerexample.Component.DaggerLoggerComponent;
import com.example.aportillo.daggerexample.Models.Lenguages.Lenguage;
import com.example.aportillo.daggerexample.Models.ServiceInterface;
import com.example.aportillo.daggerexample.Models.Util.LoggerModule;
import com.example.aportillo.daggerexample.Util.Logger;
import com.google.gson.Gson;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by aportillo on 11/08/2016.
 */
public class ServiceGenerator extends BaseService {

    @Inject
    Logger logger;

    public ServiceGenerator() {
        DaggerLoggerComponent.builder().loggerModule(new LoggerModule()).build().inject(this);
    }

    /**
     * Method to manage the response of Callback
     *
     * @param call
     * @param serviceInterface
     */
    public void response(Call<Lenguage> call, final ServiceInterface serviceInterface) {
        call.enqueue(new Callback<Lenguage>() {

            @Override
            public void onResponse(Call<Lenguage> call, retrofit2.Response<Lenguage> response) {
                try {
                    String gsonResponse = new Gson().toJson(response.body());
                    if (response.isSuccessful()) {
                        logger.logI(ServiceGenerator.class, gsonResponse);
                        serviceInterface.onSuccess(response.body());
                    } else {
                        logger.logI(ServiceGenerator.class, gsonResponse);
                        serviceInterface.onError();
                    }
                } catch (Exception e) {
                    logger.logE(ServiceGenerator.class, e.getMessage());
                    serviceInterface.onFailure();
                }

            }

            @Override
            public void onFailure(Call<Lenguage> call, Throwable t) {
                logger.logE(ServiceGenerator.class, t.getMessage());
                serviceInterface.onFailure();
            }
        });
    }
}