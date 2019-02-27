package com.example.huangruqi.pattern.memento.sample;

/**
 * @data: 2019/2/27 16:09
 * @author: 黄汝琪
 * @Email:
 * @Description: 使命召唤游戏
 */
public class CallOfDuty {

    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    public void paly() {
        System.out.println("玩游戏：" + String.format("第%d关", mCheckPoint) + "奋战杀敌中");
        mLifeValue -= 10;
        System.out.println("进度升级啦！");
        mCheckPoint++;
        System.out.println("到达" + String.format("第%d关", mCheckPoint));
    }

    public void quit() {
        System.out.println("----------------");
        System.out.println("退出前的游戏属性：" + this.toString());
        System.out.println("退出游戏");
        System.out.println("----------------");
    }

    public Memoto createMwmoto() {
        Memoto memoto = new Memoto();
        memoto.mCheckPoint = mCheckPoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    public void reastore(Memoto memoto) {
        this.mCheckPoint = memoto.mCheckPoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
        System.out.println("恢复后的游戏属性：" + this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty = [ mCheckPoint = " + mCheckPoint +
                ", mLifeValue = " + mLifeValue + ", mWeapon = " + mWeapon + "]";
    }
}
