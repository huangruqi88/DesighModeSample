package com.example.huangruqi.pattern.decorator.Person;

import android.util.Log;

/**
 * @data: 2018/12/24 19:59
 * @author: 黄汝琪
 * @Email:
 * @Description: 装饰设计模式
 */
public class GreenHeadgear extends Finery {
    @Override
    public void show() {
        super.show();
        Log.d(TAG, "隔壁老王带绿帽子");
    }
}
