package com.bawei.apps1.network;

import android.os.AsyncTask;

import java.util.HashMap;
import java.util.Map;

public class MyAsk<T> extends AsyncTask<T,T,String> {

    private String math;
    private String murl;
    private String pswd,name;
    private AskIntenters intenter;
    public MyAsk setAsket(AskIntenters intenter) {
        this.intenter = intenter;
        return this;
    }

    public MyAsk(String math, String pswd, String name) {
        this.math = math;
        this.pswd = pswd;
        this.name = name;
    }

    @Override
    protected String doInBackground(T... ts) {
        Map<String, Object> param=new HashMap<String, Object>();
        param.put("phone", name);
        param.put("pwd", pswd);
        return HttpUrls.post(math,param);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if (s != null) {
            intenter.result(s);
        }

    }

    public interface AskIntenters{
        void result(String s);
    }

}
