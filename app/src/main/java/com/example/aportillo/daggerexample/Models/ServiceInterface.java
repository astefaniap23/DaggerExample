package com.example.aportillo.daggerexample.Models;


/**
 * Created by aportillo on 05/08/2016.
 */
public interface ServiceInterface<T> {
        void onSuccess(T response);
        void onError();
        void onFailure(/*(String header, String message*/);
}
