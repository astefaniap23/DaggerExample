package com.example.aportillo.daggerexample.ui;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aportillo.daggerexample.Models.Main.MainInterface;
import com.example.aportillo.daggerexample.Presenter.MainPresenter;
import com.example.aportillo.daggerexample.R;
import com.example.aportillo.daggerexample.Util.Logger;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by aportillo on 18/08/2016.
 */
public class MainActivity extends BaseActivity implements MainInterface {

    @Inject
    Logger logger;

    @InjectView(R.id.button)
    Button button;

    @InjectView(R.id.textView)
    TextView textView;

    @Inject
    MainPresenter mainPresenterImpl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSystemComponent().inject(this);
        ButterKnife.inject(this);
        // button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logger.log("CLICK");
                loadLenguages();
            }
        });
    }


    public void loadLenguages() {
        mainPresenterImpl.loadLenguages();
    }


    @Override
    public void setTextView(String text) {
        textView.setText(text);
    }
}
