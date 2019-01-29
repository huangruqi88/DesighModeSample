package com.example.huangruqi.pattern.template_method;

/**
 * @data: 2019/1/26 09:04
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class AbstractClass {
    /**
     * 一些抽象的行为放到子类去实现
     */
    abstract void prinitiveOperation1();
    abstract void prinitiveOperation2();

    void templateMethod(){
        prinitiveOperation1();
        prinitiveOperation2();
    }
}
