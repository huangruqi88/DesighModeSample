package com.example.huangruqi.pattern.proxy.dynamic;

/**
 * @data: 2019/1/23 11:30
 * @author: 黄汝琪
 * @Email:
 * @Description: 通过装饰类扩展对象的信息修改次数
 */
public class DecorPerson implements Person {

    private PersonImpl mPerson;
    private int modifiedTimes;

    public DecorPerson(PersonImpl person) {
        this.mPerson = person;
    }

    @Override
    public String getName() {
        return mPerson.getName();
    }

    @Override
    public void setName(String name) {
        modifiedTimes++;
        mPerson.setName(name);
    }

    @Override
    public String getGender() {
        return mPerson.getGender();
    }

    @Override
    public void setGender(String gender) {
        modifiedTimes++;
        mPerson.setGender(gender);
    }

    @Override
    public int getAge() {
        return mPerson.getAge();
    }

    @Override
    public void setAge(int age) {
        modifiedTimes++;
        mPerson.setAge(age);
    }

    public int getModifiedTimes() {
        return modifiedTimes;
    }
}
