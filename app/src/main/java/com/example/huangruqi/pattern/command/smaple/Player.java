package com.example.huangruqi.pattern.command.smaple;

/**
 * date:2019/3/2
 * author:huang
 * Description:请详细描述当前类
 */
public class Player {


    public static void main(String[] args) {
        //初始化俄罗斯方块游戏
        TetrisManchine tetrisManchine = new TetrisManchine();

        LeftCommand leftCommand = new LeftCommand(tetrisManchine);
        RightCommand rightCommand = new RightCommand(tetrisManchine);
        FallCommand fallCommand = new FallCommand(tetrisManchine);
        TransformCommand transformCommand = new TransformCommand(tetrisManchine);

        //按下按钮执行不同的命令
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransformCommand(transformCommand);

        // 具体按下哪个按钮玩家说了算
        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();

    }
}
