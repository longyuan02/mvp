package com.mazhan.mvpproject;

/**
 * Created by dragonfly on 2017/2/9.
 */

public interface LoginView {
    void showProgress();
    void hideProgress();
    void setUserNameErro();
    void setPasswordErro();
    void navigateToHome();
}
