package com.example.huangruqi.pattern.decorator.Person;

import android.util.Log;

/**
 * @data: 2018/12/24 19:57
 * @author: 黄汝琪
 * @Email:
 * @Description: 装饰设计模式
 */
public class YellowTShorts extends Finery {
    @Override
    public void show() {
        mComponet.show();
        Log.d(TAG, "隔壁老王穿屎黄色T恤");
    }
}
