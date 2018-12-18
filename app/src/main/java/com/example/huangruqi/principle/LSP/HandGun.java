package com.example.huangruqi.principle.LSP;

import android.util.Log;

/**
 * @data: 2018/12/17 17:46
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 手枪实现类
 */
public class HandGun extends BaseGun {

    private static final String TAG = "里氏替换原则";

    public void handGunName() {
        Log.d(TAG, "士兵使用的武器是手枪");
    }

    @Override
    public void gunZoom() {
        handGunName();
        Log.d(TAG, "手枪小，便于携带");
    }

    @Override
    public void characteristic() {
        Log.d(TAG, "手枪一次只能发射一颗子弹");
    }

    @Override
    public void shoot() {
        Log.d(TAG, "手枪开始射击");
    }

}
