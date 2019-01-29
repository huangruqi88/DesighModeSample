package com.example.huangruqi.pattern.prototype.user;

/**
 * @data: 2019/1/25 19:30
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class User implements Cloneable{
    public int age;
    public String name;
    public String phoneName;
    public Address address;

    @Override
    public String toString() {
        return "User [ age = " + age +", name = " + name + ", phoneName = " + phoneName
                + ", address = " + address + " ]";
    }

    @Override
    protected User clone(){
        User user = null;
        try {
            user = (User) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
