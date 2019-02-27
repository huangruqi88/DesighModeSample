package com.example.huangruqi.pattern.memento.sample;

/**
 * @data: 2019/2/27 16:17
 * @author: 黄汝琪
 * @Email:
 * @Description: 备忘录模式
 */
public class Memoto {
    public int mCheckPoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memoto = [ mCheckPoint = " + mCheckPoint +
                ", mLifeValue = " + mLifeValue + ", mWeapon = " + mWeapon + "]";
    }
}
