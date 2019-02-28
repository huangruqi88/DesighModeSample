package com.example.huangruqi.pattern.singleton;

/**
 * @data: 2019/2/28 15:35
 * @Email:
 * @Description: 双重校验锁
 */
public class DoubleCheckLock {
    private volatile static DoubleCheckLock mInstance = null;

    private DoubleCheckLock() {
    }

    public static DoubleCheckLock getInstance() {
        if (null == mInstance) {
            synchronized (DoubleCheckLock.class) {
                if (null == mInstance) {
                    mInstance = new DoubleCheckLock();
                }
            }
        }
        return mInstance;
    }
}
