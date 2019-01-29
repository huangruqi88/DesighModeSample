package com.example.huangruqi.pattern.proxy.virtual;

import android.util.Log;

/**
 * @data: 2019/1/23 10:52
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class RealIamge implements Image {
    private static final String TAG = "虚拟代理模式";
    private String mFileName;
    public RealIamge(String fileName) {
        this.mFileName = fileName;
        loadImageFromDisk();
    }
    @Override
    public void displayImage() {
        Log.d(TAG, "loadImageFromDisk: -----Displaying " + mFileName);
    }

    private void loadImageFromDisk() {
        Log.d(TAG, "loadImageFromDisk: -----Loading " + mFileName);
    }
}
