package com.example.huangruqi.pattern.proxy.dynamic;

/**
 * @data: 2019/1/23 11:09
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public interface Person {

    /**
     * 获取姓名
     * @return
     */
    String getName();

    /**
     * 设置姓名
     * @param name
     */
    void setName(String name);

    /**
     * 设置姓名
     */
    String getGender();
    /**
     * 设置姓名
     * @param gender
     */
    void setGender(String gender);
    /**
     * 设置姓名
     */
    int getAge();
    /**
     * 设置姓名
     * @param age
     */
    void setAge(int age);
}
