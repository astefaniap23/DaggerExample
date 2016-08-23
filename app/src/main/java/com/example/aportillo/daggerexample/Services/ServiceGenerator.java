package com.example.aportillo.daggerexample.Services;

import android.util.Log;

import com.example.aportillo.daggerexample.Models.ServiceInterface;
import com.google.gson.Gson;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by aportillo on 11/08/2016.
 */
public class ServiceGenerator<T> extends BaseService {

    @Inject
    public ServiceGenerator() {
    }

    public void response(Call<T> call, final ServiceInterface serviceInterface) {
        call.enqueue(new Callback<T>() { //Metodo que se encarga de manejar la respuesta del callback

            @Override
            public void onResponse(Call<T> call, retrofit2.Response<T> response) {
                try {
                    if (response.isSuccessful()) {
                        Log.i("json: ", new Gson().toJson(response.body()));
                        serviceInterface.onSuccess(response.body());
                    } else {
                        serviceInterface.onError();
                        throw new Exception("Is Not Successful.");
                    }
                } catch (Exception e) {
                    Log.e("Error: ", e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                Log.d("onFailure", t.getMessage());
            }
        });
    }
}