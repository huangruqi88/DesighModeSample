package com.example.huangruqi.pattern.command;

/**
 * date:2019/3/1
 * author:huang
 * Description:请详细描述当前类
 */
public class Invoker {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void excuteCommand(){
        command.execute();
    }
}
