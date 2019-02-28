package com.example.huangruqi.pattern.singleton;

/**
 * @data: 2019/2/28 15:53
 * @author: 黄汝琪
 * @Email:
 * @Description: 枚举单例对象
 */
public enum  SingletonEnum {
    /**
     * 单例对象
     */
    INSTANCE;

    private SingleClazz mInstance;

    SingletonEnum() {
        this.mInstance = new SingleClazz();
    }

    public SingleClazz getInstance() {
        return this.mInstance;
    }

    public void doSomething(){
        System.out.println("do something!!");
    }
}

class SingleClazz{
    public SingleClazz() {
        System.out.println("枚举单例实例创建成功");
    }
}