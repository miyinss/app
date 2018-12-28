package com.bawei.apps1.login.loginmodel;

import android.util.Log;

import com.bawei.apps1.network.MyAsk;

public class LoginModel implements ILoginModels {

    @Override
    public void login(final String url, final String username, final String pwd, final ILoginCallBack loginCallBack) {
        new Runnable() {
            @Override
            public void run() {
                new MyAsk<String>(url, username, pwd).setAsket(new MyAsk.AskIntenters() {
                    @Override
                    public void result(String t) {
                        Log.i("", "result:=== " + t);
                        //接口实现
                        if (t != null) {
                            //类实现的接口中的方法时
                            loginCallBack.onStatus(t);
                        } else {
                            loginCallBack.onFailed();
                        }
                    }
                }).execute();
            }
        }.run();
    }
}
