package com.example.huangruqi.pattern.memento;

/**
 * @data: 2019/2/27 15:31
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Originator {
    /**
     * 需要保存的属性，可能有多个
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建备忘录，将当前需要保存的信息导入并实例化一个Memento对象。
     * @return
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 恢复备忘录将Memento导入并
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    /**
     * 显示数据
     */
    public void show(){
        System.out.println("saveState = " + state);
    }
}
