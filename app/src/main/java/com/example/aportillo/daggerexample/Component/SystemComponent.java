package com.example.aportillo.daggerexample.Component;


import com.example.aportillo.daggerexample.Models.Main.MainModule;
import com.example.aportillo.daggerexample.Models.SystemModule;
import com.example.aportillo.daggerexample.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aportillo on 18/08/2016.
 */

@Singleton
@Component(modules = {SystemModule.class, MainModule.class})
public interface SystemComponent {

    void inject(MainActivity activity);

}
