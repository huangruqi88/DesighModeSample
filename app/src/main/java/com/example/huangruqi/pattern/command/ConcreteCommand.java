package com.example.huangruqi.pattern.command;

/**
 * date:2019/3/1
 * author:huang
 * Description:请详细描述当前类
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    protected void execute() {
        receiver.action();
    }
}
