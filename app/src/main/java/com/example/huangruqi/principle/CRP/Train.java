package com.example.huangruqi.principle.CRP;

import android.util.Log;

/**
 * @data: 2018/12/17 19:22
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description:
 */
public class Train {

    private static final String TAG = "聚合/组合复用原则";

    /**
     * 定义一个私有的车厢类的变量（在一个类中定义另外一个类的引用）
     */
    private RailwayCarriage mRailwayCarriage;

    public void carry(){
        if (mRailwayCarriage != null) {
            mRailwayCarriage.loading();
        }
        Log.d(TAG, "车头装载5人 ");
    }

    private void run() {
        Log.d(TAG, "火车跑 ");
    }

    public RailwayCarriage getRailwayCarriage() {
        return mRailwayCarriage;
    }

    public void setRailwayCarriage(RailwayCarriage railwayCarriage) {
        mRailwayCarriage = railwayCarriage;
    }
}
