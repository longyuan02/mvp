package com.mazhan.mvpproject;

/**
 * Created by dragonfly on 2017/2/9.
 */

public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }
    void login(String username, String password, OnLoginFinishedListener listener);
}
