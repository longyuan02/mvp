package com.mazhan.mvpproject;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by dragonfly on 2017/2/9.
 */

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                boolean erro=false;
                if(TextUtils.isEmpty(username)){
                    erro=true;
                    listener.onUsernameError();
                }
                if(TextUtils.isEmpty(password)){
                    erro=true;
                    listener.onPasswordError();
                }
                if(!erro){
                    listener.onSuccess();
                }
            }
        });
    }
}
