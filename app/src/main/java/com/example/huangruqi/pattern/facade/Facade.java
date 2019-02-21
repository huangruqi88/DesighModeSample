package com.example.huangruqi.pattern.facade;

/**
 * @data: 2019/2/20 11:51
 * @author: 黄汝琪
 * @Email:
 * @Description: 外观类
 */
public class Facade {
    private SubSystem1 mSubSystem1;
    private SubSystem2 mSubSystem2;
    private SubSystem3 mSubSystem3;
    private SubSystem4 mSubSystem4;

    /**
     * 外观类需要了解所有的子系统的方法或属性，进行组合，供外部调用。
     */
    public Facade() {
        mSubSystem1 = new SubSystem1();
        mSubSystem2 = new SubSystem2();
        mSubSystem3 = new SubSystem3();
        mSubSystem4 = new SubSystem4();
    }

    public void methodA() {
        System.out.println("\n 方法组A()--------");
        mSubSystem1.methodOne();
        mSubSystem2.methodTwo();
        mSubSystem4.methodFour();
    }

    public void methodB() {
        System.out.println("\n 方法组B()--------");
        mSubSystem2.methodTwo();
        mSubSystem3.methodThree();
    }
}
