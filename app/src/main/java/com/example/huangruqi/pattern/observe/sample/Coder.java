package com.example.huangruqi.pattern.observe.sample;

import java.util.Observable;
import java.util.Observer;

/**
 * @data: 2019/2/21 10:32
 * @author: 黄汝琪
 * @Email:
 * @Description: 程序员是观察者
 */
public class Coder implements Observer {

    public String name;

    public Coder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi, " + name + ", DevTechFrontier 更新啦！内容：" + arg);
    }

    @Override
    public String toString() {
        return "码农：" + name;
    }
}
