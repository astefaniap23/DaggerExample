package com.example.aportillo.daggerexample.Presenter;

import com.example.aportillo.daggerexample.Models.Lenguages.Lenguages;
import com.example.aportillo.daggerexample.Models.MainPresenterInterface;
import com.example.aportillo.daggerexample.Models.ServiceInterface;
import com.example.aportillo.daggerexample.Services.LenguagesServices;
import com.example.aportillo.daggerexample.Util.Logger;
import com.example.aportillo.daggerexample.ui.MainActivity;

import javax.inject.Inject;

/**
 * Created by aportillo on 18/08/2016.
 */
public class MainPresenterImpl implements MainPresenterInterface {
    @Inject
    Logger logger;

    LenguagesServices lenguagesServices;
    MainActivity mainActivity;

    @Inject
    public MainPresenterImpl(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void loadLenguages() {
        try {
            lenguagesServices.getLanguageServicesI(new ServiceInterface<Lenguages>() {
                @Override
                public void onSuccess(Lenguages value) {
                    logger.log("onSuccess.value" + String.valueOf(value));
                }

                @Override
                public void onError() {
                    logger.log("onError" + "onError");
                }
            }, Lenguages.class);
        } catch (Exception e) {
            logger.log(getClass().getSimpleName() + "loadPba - " + e.getMessage());
        }
    }

}