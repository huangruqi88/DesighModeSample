package com.example.huangruqi.pattern.template_method;

/**
 * @data: 2019/2/16 11:22
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class AbstractClass {
    /**
     * 抽象的行为 1，放到子类去实现
     */
    abstract void primitiveOperation1();
    /**
     * 抽象的行为 2，放到子类去实现
     */
    abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }

}
