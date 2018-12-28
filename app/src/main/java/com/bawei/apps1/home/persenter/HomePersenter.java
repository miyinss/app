package com.bawei.apps1.home.persenter;

import android.util.Log;

import com.bawei.apps1.MainActivity;
import com.bawei.apps1.api.Api;
import com.bawei.apps1.home.model.HomeModelLenter;

public class HomePersenter implements IHomePersenter,HomeModelLenter.ModelInternet {

    MainActivity main;
    private final HomeModelLenter modelLenter;
    private String modeInterDate;
    public HomePersenter(MainActivity main) {
        this.main = main;
        //初始化model层
        modelLenter = new HomeModelLenter(this);

    }

    @Override
    public void getsuccess(String ss) {
        main.getViewData(ss);
    }

    @Override
    public void geterror() {
        main.getViewData("加载失败");
    }

    @Override
    public void getModel() {
        //将请求接口传入
        modelLenter.getData(Api.BASE_SHOP);
        Log.i("", "getModelDate: "+ modeInterDate);
    }
}
