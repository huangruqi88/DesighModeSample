package com.example.huangruqi.pattern.factory_method;

/**
 * @data: 2019/1/23 15:33
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class StudentFractory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Student();
    }
}
