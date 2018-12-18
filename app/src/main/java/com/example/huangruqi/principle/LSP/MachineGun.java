package com.example.huangruqi.principle.LSP;

import android.util.Log;

/**
 * @data: 2018/12/17 17:49
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 机枪实现类
 */
public class MachineGun extends BaseGun {

    private static final String TAG = "里氏替换原则";

    @Override
    void gunZoom() {
        cachineGunName();
        Log.d(TAG, "班长，火力十分凶猛");
    }

    private void cachineGunName() {
        Log.d(TAG, "士兵使用的武器是机枪");
    }

    @Override
    void characteristic() {
        Log.d(TAG, "机枪可以扫射");
    }

    @Override
    void shoot() {
        Log.d(TAG, "机枪开始射击");
    }
}
