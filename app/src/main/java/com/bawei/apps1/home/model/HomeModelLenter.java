package com.bawei.apps1.home.model;

import android.util.Log;

import com.bawei.apps1.network.MyAsk;

public class HomeModelLenter implements IHomeModelLenter{

   private ModelInternet modelInternet;

    public HomeModelLenter(ModelInternet modelInternet) {
        this.modelInternet = modelInternet;
    }

    @Override
    public void getData(final String datas) {
        //请求数据
        new Runnable(){
            @Override
            public void run() {
              new MyAsk<String>(datas,"GET").setAsket(new MyAsk.AskIntenters() {
                  @Override
                  public void result(String s) {
                      Log.i("数据" ,"result: "+s);

                      if (s != null) {
                          modelInternet.getsuccess(s);
                      } else {
                          modelInternet.geterror();
                      }
                  }
              }).execute();
            }
        }.run();



    }
    public interface ModelInternet{
        void  getsuccess(String ss);
        void  geterror();
    }

}
