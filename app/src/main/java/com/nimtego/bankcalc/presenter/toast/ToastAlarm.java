package com.nimtego.bankcalc.presenter.toast;

public interface ToastAlarm {
    void toastMessage(String message);
    void alarmMessage(String message);
    void destroy();
}
