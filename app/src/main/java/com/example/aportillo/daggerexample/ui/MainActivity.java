package com.example.aportillo.daggerexample.ui;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aportillo.daggerexample.Presenter.MainPresenterImpl;
import com.example.aportillo.daggerexample.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by aportillo on 18/08/2016.
 */
public class MainActivity extends BaseActivity {

    @InjectView(R.id.button)
    Button button;

    @Inject
    MainPresenterImpl mainPresenterImpl;


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
                loadLenguages();
            }
        });
    }


   public void loadLenguages() {
       mainPresenterImpl.loadLenguages();
    }

}
