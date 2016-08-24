package com.example.aportillo.daggerexample.Presenter;

import com.example.aportillo.daggerexample.Models.Lenguages.Lenguage;
import com.example.aportillo.daggerexample.Models.Main.MainPresenterInterface;
import com.example.aportillo.daggerexample.Models.ServiceInterface;
import com.example.aportillo.daggerexample.Services.LenguagesServices;
import com.example.aportillo.daggerexample.Util.Constans;
import com.example.aportillo.daggerexample.Util.Logger;
import com.example.aportillo.daggerexample.ui.MainActivity;

import javax.inject.Inject;

/**
 * Created by aportillo on 18/08/2016.
 */
public class MainPresenter implements MainPresenterInterface {
    @Inject
    Logger logger;

    @Inject
    Constans constans;

    private LenguagesServices lenguagesServices;
    private MainActivity mainActivity;

    @Inject
    public MainPresenter(MainActivity mainActivity, LenguagesServices lenguagesServices) {
        this.mainActivity = mainActivity;
        this.lenguagesServices = lenguagesServices;
    }

    @Override
    public void onCreate(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Override
    public void loadLenguages() {
        try {
            lenguagesServices.getLenguageServicesI(new ServiceInterface<Lenguage>() {
                @Override
                public void onSuccess(Lenguage value) {
               //        mainActivity.setTextView(String.valueOf(value.getLs()));
                       logger.logI(MainPresenter.class ,constans.json+ String.valueOf(value.getLs()));
                }

                @Override
                public void onError() {
                    //          mainActivity.setTextView("onError");
                    logger.logI(MainPresenter.class , constans.error);
                }

                @Override
                public void onFailure() {
                    //       mainActivity.setTextView(error);
                    logger.logI(MainPresenter.class , constans.error);
                }
            }, Lenguage.class);
        } catch (Exception e) {
            logger.logI(MainPresenter.class ,e.getMessage());
            //  mainActivity.setTextView( String.valueOf(e.getMessage()));
        }
    }

}