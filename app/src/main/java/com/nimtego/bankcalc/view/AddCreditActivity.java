package com.nimtego.bankcalc.view;

import android.os.Bundle;

import com.nimtego.bankcalc.R;
import com.nimtego.bankcalc.presenter.Presenter;
import com.nimtego.bankcalc.presenter.AddCreditPresenter;

public class AddCreditActivity extends AbstractView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_credit);
    }

    @Override
    public Presenter setPresenter() {
        return new AddCreditPresenter();
    }
}
