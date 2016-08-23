package com.example.aportillo.daggerexample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.aportillo.daggerexample.Component.SystemComponent;

/**
 * Created by aportillo on 18/08/2016.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public SystemComponent getSystemComponent() {
        return ((MyApplication) getApplication()).getSystemComponent();
    }

    protected MyApplication getApp() {
        return (MyApplication) getApplication();
    }
}
