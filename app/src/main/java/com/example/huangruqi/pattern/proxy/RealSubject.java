package com.example.huangruqi.pattern.proxy;

import android.util.Log;

/**
 * @data: 2019/1/22 19:34
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class RealSubject extends Subject{
    private static final String TAG = "RealSubject";
    @Override
    protected void request() {
        Log.d(TAG, "request: ------真实的请求---");
    }
}
