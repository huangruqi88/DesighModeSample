package com.example.huangruqi.pattern.proxy.girl;

import android.util.Log;

/**
 * @data: 2019/1/22 18:58
 * @author: 黄汝琪
 * @Email:
 * @Description: 追求者
 */
public class Pursuit implements GiveGift {
    private BeautifulGirl mBeautifulGirl;

    private static final String TAG = "代理模式";
    public Pursuit(BeautifulGirl beautifulGirl) {
        mBeautifulGirl = beautifulGirl;
    }

    @Override
    public void giveWatch() {
        Log.d(TAG, mBeautifulGirl.getName() + "送手表");
    }

    @Override
    public void giveFlowers() {
        Log.d(TAG, mBeautifulGirl.getName() + "送鲜花");
    }

    @Override
    public void giveChocolate() {
        Log.d(TAG, mBeautifulGirl.getName() + "送巧克力");
    }
}
