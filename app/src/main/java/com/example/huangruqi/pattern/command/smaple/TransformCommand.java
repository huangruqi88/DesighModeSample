package com.example.huangruqi.pattern.command.smaple;

/**
 * date:2019/3/2
 * author:huang
 * Description:请详细描述当前类
 */
public class TransformCommand implements Command {

    /**
     * 持有一个接受者俄罗斯方块游戏对象的引用
     */
    private TetrisManchine tetrisManchine;

    public TransformCommand(TetrisManchine tetrisManchine) {
        this.tetrisManchine = tetrisManchine;
    }

    @Override
    public void execute() {
        // 调用游戏机里的具体方法执行操作。
        tetrisManchine.tranform();
    }

}
