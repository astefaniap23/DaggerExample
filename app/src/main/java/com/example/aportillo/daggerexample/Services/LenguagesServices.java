package com.example.aportillo.daggerexample.Services;

import android.util.Log;

import com.example.aportillo.daggerexample.Component.DaggerServiceGeneratorComponent;
import com.example.aportillo.daggerexample.Models.Lenguages.LeguageSeviceInterface;
import com.example.aportillo.daggerexample.Models.Lenguages.Lenguage;
import com.example.aportillo.daggerexample.Models.ServiceInterface;
import com.example.aportillo.daggerexample.Models.Util.NetModule;
import com.example.aportillo.daggerexample.Models.Util.ServiceGeneratorModule;

import javax.inject.Inject;

import retrofit2.Call;



/**
 * Created by aportillo on 18/08/2016.
 */
public class LenguagesServices extends BaseService {

    @Inject
    ServiceGenerator serviceGenerator;
    //NetComponent mNetComponent;
    LeguageSeviceInterface leguageSeviceInterface;

    public LenguagesServices() {
        super();
      /*  mNetComponent = DaggerNetComponent.builder()
                .netModule(new NetModule())
                .build();*/
        DaggerServiceGeneratorComponent.builder()
                .netModule(new NetModule())
                .serviceGeneratorModule(new ServiceGeneratorModule())
                .build().inject(this);
    }

    public void getLenguageServicesI(ServiceInterface serviceInterface, Class t) throws Exception {
        try {
            leguageSeviceInterface = getRetrofit().create(LeguageSeviceInterface.class);
            Call<Lenguage> aCall = (Call<Lenguage>) leguageSeviceInterface.getLenguages();
            serviceGenerator.response(aCall, serviceInterface);
        } catch (Exception e) {
            Log.e("Error", getClass().getSimpleName() + ":" + e.getMessage());
        }
    }
}
