package com.example.huangruqi.pattern.command.command2;

/**
 * date:2019/3/1
 * author:huang
 * Description:请详细描述当前类
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
