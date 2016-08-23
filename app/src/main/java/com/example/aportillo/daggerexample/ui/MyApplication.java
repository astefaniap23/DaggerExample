package com.example.aportillo.daggerexample.ui;

import android.app.Application;

import com.example.aportillo.daggerexample.Component.DaggerSystemComponent;
import com.example.aportillo.daggerexample.Component.SystemComponent;
import com.example.aportillo.daggerexample.Models.SystemModule;

/**
 * Created by aportillo on 18/08/2016.
 */
public class MyApplication extends Application {

    private SystemComponent systemComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.systemComponent = DaggerSystemComponent.builder()
                .systemModule(new SystemModule(this))
                .build();
    }

    public SystemComponent getSystemComponent() {
        return this.systemComponent;
    }

  /*  public UserComponent createUserComponent(User user) {
        userComponent = systemComponent.plus(new UserModule(user));
        return userComponent;
    }

    public void releaseUserComponent() {
        userComponent = null;
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }*/
}
