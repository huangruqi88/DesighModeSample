package com.example.huangruqi.pattern.command.smaple;

/**
 * date:2019/3/2
 * author:huang
 * Description:命令模式中唯一处理逻辑的类
 */
public class TetrisManchine {

    /**
     * 真正处理“向左”逻辑的代码
     */
    public void toLeft(){
        System.out.println("向左");
    }
    /**
     * 真正处理“向右”逻辑的代码
     */
    public void toRight(){
        System.out.println("向右");
    }
    /**
     * 真正处理“快速落下”逻辑的代码
     */
    public void fastToBottom(){
        System.out.println("快速落下");
    }
    /**
     * 真正处理“改变形状”逻辑的代码
     */
    public void tranform(){
        System.out.println("改变形状");
    }
}
