package com.example.huangruqi.pattern.command.smaple;

/**
 * date:2019/3/2
 * author:huang
 * Description:请详细描述当前类
 */
public class Buttons {
    /**
     * 向左移动的命令对象引用
     */
    private LeftCommand leftCommand;
    /**
     * 向右移动的命令对象引用
     */
    private RightCommand rightCommand;
    /**
     * 快速落下的命令对象引用
     */
    private FallCommand fallCommand;
    /**
     * 变换形状的命令对象引用
     */
    private TransformCommand transformCommand;

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    /**
     * 按下按钮向左移动
     */
    public void toLeft(){
       leftCommand.execute();
    }

    /**
     * 按下按钮向右移动
     */
    public void toRight(){
        rightCommand.execute();
    }
    /**
     * 按下按钮快速落下
     */
    public void fall(){
       fallCommand.execute();
    }
    /**
     * 按下按钮改变形状
     */
    public void transform(){
       transformCommand.execute();
    }

}
