package com.example.huangruqi.application;

import android.app.Application;

import com.blankj.utilcode.util.Utils;
//import com.example.huangruqi.Utils.SPUtils;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.application
 * @data 2018/12/15 10:46
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
//        SPUtils.getInstance("MySPDate");
    }
}
