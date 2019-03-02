package com.example.huangruqi.pattern.command;

/**
 * date:2019/3/1
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    protected abstract void execute();
}
