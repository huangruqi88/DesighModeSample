package com.example.huangruqi.pattern.memento;

/**
 * @data: 2019/2/27 15:32
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    /**
     * 需要保存的数据，可以是多个
     * @return
     */
    public String getState() {
        return state;
    }
}
