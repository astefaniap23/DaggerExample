package com.example.aportillo.daggerexample.Models;

import com.example.aportillo.daggerexample.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aportillo on 22/08/2016.
 */
@Module
public class MainModule {

    @Provides
    MainActivity provideMainActivity(){
        return new MainActivity();
    }
}
