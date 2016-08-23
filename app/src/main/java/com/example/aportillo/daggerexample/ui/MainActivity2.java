/*
package com.example.aportillo.daggerexample.View;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aportillo.daggerexample.Models.Lenguages.Lenguages;
import com.example.aportillo.daggerexample.Models.ServiceInterface;
import com.example.aportillo.daggerexample.R;
import com.example.aportillo.daggerexample.Services.LenguagesServices;

import javax.inject.Inject;

public class MainActivity2 extends BaseActivity {
    TextView textView;
    Button button;

    @Inject
    ConnectivityManager connectivityManager;

    private LenguagesServices languagesServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSystemComponent().inject(this);
        boolean activeNetworkMetered = connectivityManager.isActiveNetworkMetered();
      ///  this.connection();


        button = (Button) findViewById(R.id.button);
     */
/*  VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = component.provideVehicle();*//*

        //Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadLenguages();
            }
        });
    }

    private void loadLenguages() {
        try {
            this.languagesServices.getLanguageServicesI(new ServiceInterface<Lenguages>() {
                @Override
                public void onSuccess(Lenguages value) {
                    Log.e("onSuccess.value", String.valueOf(value));
                }
                @Override
                public void onError() {
                    Log.e("onError", "onError");
                }
            },Lenguages.class );
        } catch (Exception e) {
            Log.e(getClass().getSimpleName(), "loadLenguages - " + e.getMessage());
        }
    }

    private void connection() {
        this.languagesServices = new LenguagesServices();
    }

}
*/
