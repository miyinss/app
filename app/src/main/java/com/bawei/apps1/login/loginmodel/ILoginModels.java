package com.bawei.apps1.login.loginmodel;

public interface ILoginModels {
    public void login(String url,String username,String pwd,ILoginCallBack loginCallBack);
    /**
     *    登陆回调接口及回调方法
     */
    interface ILoginCallBack {
        public void onStatus(String data);
        public void onFailed();
    }


}
