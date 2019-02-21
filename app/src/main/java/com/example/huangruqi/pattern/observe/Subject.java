package com.example.huangruqi.pattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2019/2/21 09:53
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class Subject {
    private List<Observer> mObservers = new ArrayList<>();

    /**
     * 订阅观察者
     * @param observer
     */
    public void subscribe(Observer observer){
        mObservers.add(observer);
    }

    /**
     * 解除订阅观察者
     * @param observer
     */
    public void unSubscribe(Observer observer){
        mObservers.remove(observer);
    }

    /**
     * 更新
     */

    public void notifyObserver(){
        for (Observer observer :mObservers) {
            observer.update();
        }
    }
}
