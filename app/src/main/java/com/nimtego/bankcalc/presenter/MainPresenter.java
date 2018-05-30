package com.nimtego.bankcalc.presenter;

import android.util.Log;
import android.view.View;

import com.nimtego.bankcalc.R;
import com.nimtego.bankcalc.view.AddCreditActivity;

public class MainPresenter extends AbstractBasePresenter{
    private final String LOG_TAG = "Main presenter";

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.fab) {
            Log.v(LOG_TAG, "Fab push");
            intent();
        }
    }

    @Override
    Class getNextActivity() {
        Log.v(LOG_TAG, "Get next activity");
        return AddCreditActivity.class;
    }
}
