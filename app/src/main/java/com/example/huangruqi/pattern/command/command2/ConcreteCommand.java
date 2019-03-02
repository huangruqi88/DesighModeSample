package com.example.huangruqi.pattern.command.command2;


/**
 * date:2019/3/1
 * author:huang
 * Description:请详细描述当前类
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
