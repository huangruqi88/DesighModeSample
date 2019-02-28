package com.example.huangruqi.pattern.iterator.sample;

/**
 * @data: 2019/2/28 10:17
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Employee {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别
     */
    private String sex;
    /**
     * 职位
     */
    private String profession;

    public Employee(String name, int age, String sex, String profession) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Employee = [name = " + name + " ,age = " + age
                + " ,sex = " + sex + " ,profession = " + profession + "]";
    }
}
