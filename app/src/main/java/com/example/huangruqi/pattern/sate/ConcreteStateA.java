package com.example.huangruqi.pattern.sate;

/**
 * @data: 2019/2/22 09:39
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
