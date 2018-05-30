package com.nimtego.bankcalc.presenter;

import android.view.View;

import com.nimtego.bankcalc.view.AbstractView;
import com.nimtego.bankcalc.view.CommonView;

public interface Presenter<T extends AbstractView> extends View.OnClickListener{
    void attach(T commonView);
    void detach();
    void intent();

}
