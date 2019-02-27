package com.example.huangruqi.pattern.memento;

/**
 * @data: 2019/2/27 15:36
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Caretaker {
    private Memento mMemento;

    /**
     * 得到备忘录
     * @return
     */
    public Memento getMemento() {
        return mMemento;
    }


    /**
     * 设置备忘录
     * @param memento
     */
    public void setMemento(Memento memento) {
        mMemento = memento;
    }
}
