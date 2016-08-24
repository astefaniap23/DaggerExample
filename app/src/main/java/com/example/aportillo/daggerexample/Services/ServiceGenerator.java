package com.example.aportillo.daggerexample.Services;

import com.example.aportillo.daggerexample.Models.ServiceInterface;
import com.example.aportillo.daggerexample.Util.Constans;
import com.example.aportillo.daggerexample.Util.Logger;
import com.google.gson.Gson;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by aportillo on 11/08/2016.
 */
public class ServiceGenerator<T> extends BaseService {

    @Inject
    Logger logger;

    @Inject
    Constans constans;

    @Inject
    public ServiceGenerator() {
    }

    /**
     * Method to manage the response of Callback
     *
     * @param call
     * @param serviceInterface
     */
    public void response(Call<T> call, final ServiceInterface serviceInterface) {
        call.enqueue(new Callback<T>() {

            @Override
            public void onResponse(Call<T> call, retrofit2.Response<T> response) {
                try {
                    String gsonResponse = new Gson().toJson(response.body());
                    if (response.isSuccessful()) {
                             logger.logI(ServiceGenerator.class, 1+ gsonResponse);
                        serviceInterface.onSuccess(response.body());
                    } else {
                        //             logger.logE(ServiceGenerator.class, constans.error + gsonResponse);
                        serviceInterface.onError();
                    }
                } catch (Exception e) {
                    //                logger.logE(ServiceGenerator.class, constans.error + e.getMessage());
                    serviceInterface.onFailure();
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                //           logger.logE(ServiceGenerator.class,  constans.error  + t.getMessage());
                serviceInterface.onFailure();
            }
        });
    }
}