package com.bawei.apps1.login.loginpensenter;

import android.util.Log;

import com.bawei.apps1.api.Api;
import com.bawei.apps1.login.LoginActivity;
import com.bawei.apps1.login.loginmodel.LoginModel;

public class LoginPersenter implements ILoginPersenter {
    private final LoginModel loginModel;
    LoginActivity loginActivity;
    public LoginPresenterImpl(LoginActivity loginActivity) {
        this.loginActivity=loginActivity;
        //初始化model
        loginModel = new LoginModel();
    }

    @Override
    public void loginPre(String name, String pswd) {
        loginModel.login(Api., name, pswd, new LoginModel.ILoginCallBack() {
            @Override
            public void onStatus(String data) {
               /* Log.i("", "onStatus: "+data);
                loginActivity.jumpActivity();*/
            }

            @Override
            public void onFailed() {

            }
        });
    }
}
