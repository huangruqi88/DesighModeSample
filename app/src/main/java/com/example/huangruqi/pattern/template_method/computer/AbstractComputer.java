package com.example.huangruqi.pattern.template_method.computer;

/**
 * @data: 2019/2/16 10:40
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class AbstractComputer {

    void powerOn(){
        System.out.println("开启电源");
    }

    void checkHardware(){
        System.out.println("硬件检查");
    }
    void loadOS(){
        System.out.println("载入操作系统");
    }
    void login(){
        System.out.println("绿帽子的计算机无法验证，直接进入系统");
    }

    /**
     * 启动计算机的方法，步骤固定为开启电源、系统检查、加载操作系统、用户登录。
     * 该方法为 final ，防止算法框架被更改。
     */
    public final void startUp(){
        System.out.println("---------- 开机 START ----------");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.out.println("---------- 关机 END ----------");
    }
}
