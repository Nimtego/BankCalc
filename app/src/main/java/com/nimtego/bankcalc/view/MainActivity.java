package com.nimtego.bankcalc.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

import com.nimtego.bankcalc.R;
import com.nimtego.bankcalc.presenter.MainPresenter;
import com.nimtego.bankcalc.presenter.Presenter;

public class MainActivity extends AbstractView {

    private final String LOG_TAG = "Main activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public Presenter setPresenter() {
        return new MainPresenter();
    }

    private void init() {
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(mPresenter);
        Log.v(LOG_TAG, "Init");

    }
}
