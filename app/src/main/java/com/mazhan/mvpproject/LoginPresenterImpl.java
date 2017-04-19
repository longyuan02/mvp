package com.mazhan.mvpproject;

/**
 * Created by dragonfly on 2017/2/9.
 */

public class LoginPresenterImpl implements LoginPresenter,LoginInteractor.OnLoginFinishedListener{
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView tlonginview){
        this.loginView=tlonginview;
        this.loginInteractor=new LoginInteractorImpl();
    }
    @Override
    public void validateCredentials(String username, String password) {
        if(loginView!=null){
            loginView.showProgress();
        }
        loginInteractor.login(username,password,this);
    }

    @Override
    public void onDestroy() {
    loginView=null;
    }

    @Override
    public void onUsernameError() {
    loginView.setUserNameErro();
    }

    @Override
    public void onPasswordError() {
    loginView.setPasswordErro();
    }

    @Override
    public void onSuccess() {
    loginView.navigateToHome();
    }
}
