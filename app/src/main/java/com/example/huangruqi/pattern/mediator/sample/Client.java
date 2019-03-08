package com.example.huangruqi.pattern.mediator.sample;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class Client {
    public static void main(String[] args) {
        //构造主板对象
        MainBoard mediator = new MainBoard();

        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard graphicsCard = new GraphicsCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);


        mediator.setCdDevice(cdDevice);
        mediator.setCpu(cpu);
        mediator.setGraphicsCard(graphicsCard);
        mediator.setSoundCard(soundCard);

        cdDevice.load();
    }
}
