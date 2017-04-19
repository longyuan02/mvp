package com.mazhan.mvpproject;

/**
 * Created by dragonfly on 2017/2/9.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
