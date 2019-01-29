package com.example.huangruqi.pattern.proxy.dynamic;

/**
 * @data: 2019/1/23 11:28
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class PersonImpl implements Person {
    private String mName;
    private int mAge;
    private String mGender;

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public void setName(String name) {
        this. mName = name;
    }

    @Override
    public int getAge() {
        return mAge;
    }

    @Override
    public void setAge(int age) {
        this.mAge = age;
    }


    @Override
    public String getGender() {
        return mGender;
    }

    @Override
    public void setGender(String gender) {
        this.mGender = gender;
    }
}
