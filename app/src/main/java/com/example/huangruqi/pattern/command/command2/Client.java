package com.example.huangruqi.pattern.command.command2;

/**
 * date:2019/3/2
 * author:huang
 * Description:请详细描述当前类
 */
public class Client {
    public static void main(String[] args) {

        //构造一个接收者。
        Receiver receiver = new Receiver();
        //根据一个接收者对象构建一个命令对象
        Command command = new ConcreteCommand(receiver);

        //根据具体的对象构建请求者对象
        Invoker invoker = new Invoker(command);
        //执行请求方法。
        invoker.action();
    }
}
