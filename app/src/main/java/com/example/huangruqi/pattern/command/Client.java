package com.example.huangruqi.pattern.command;

/**
 * date:2019/3/1
 * author:huang
 * Description:请详细描述当前类
 */
public class Client {


    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.excuteCommand();
    }
}
