package com.example.huangruqi.principle.LSP;

import android.util.Log;

/**
 * @data: 2018/12/17 17:49
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 步枪实现类
 */
public class RifleGun extends BaseGun {

    private static final String TAG = "里氏替换原则";

    public void rifleGunName() {
        Log.d(TAG, "士兵使用的武器是步枪");
    }

    @Override
    public void gunZoom() {
        rifleGunName();
        Log.d(TAG, "步枪长，不益于携带");
    }

    @Override
    public void characteristic() {
        Log.d(TAG, "步枪可以连续射击");
    }

    @Override
    public void shoot() {
        Log.d(TAG, "步枪开始射击");
    }

}
