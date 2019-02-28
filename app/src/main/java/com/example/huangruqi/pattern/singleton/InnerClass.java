package com.example.huangruqi.pattern.singleton;

/**
 * @data: 2019/2/28 15:46
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class InnerClass {

    private InnerClass() {
    }

    public static InnerClass getInstance(){

        return SingletonHolder.mInstance;
    }
    private static class SingletonHolder{
        private static final InnerClass mInstance = new InnerClass();
    }
}
