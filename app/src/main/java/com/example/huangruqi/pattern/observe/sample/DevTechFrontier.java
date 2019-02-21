package com.example.huangruqi.pattern.observe.sample;

import java.util.Observable;

/**
 * @data: 2019/2/21 10:37
 * @author: 黄汝琪
 * @Email:
 * @Description: 开发技术前线，这个网站是被观察者角色，当他有更新时，
 *                所有的程序员都会接到通知
 */
public class DevTechFrontier extends Observable {
    public void postNewPublication(String content){
        // 表示状态或者内容发生改变
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}
