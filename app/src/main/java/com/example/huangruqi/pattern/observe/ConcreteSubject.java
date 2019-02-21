package com.example.huangruqi.pattern.observe;

/**
 * @data: 2019/2/21 10:10
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
