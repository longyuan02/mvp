package com.mazhan.mvpproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView {
    private LoginPresenter presenter;
    private EditText username, password;
    private LoginPresenterImpl loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter=new LoginPresenterImpl(this);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.validateCredentials(username.getText().toString(),password.getText().toString());
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUserNameErro() {
        username.setError("姓名错误");
    }

    @Override
    public void setPasswordErro() {
        password.setError("密码格式错误");
    }

    @Override
    public void navigateToHome() {
        Toast.makeText(this,"点击",Toast.LENGTH_SHORT).show();
    }
}
