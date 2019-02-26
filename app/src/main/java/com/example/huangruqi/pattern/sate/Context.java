package com.example.huangruqi.pattern.sate;

/**
 * @data: 2019/2/22 09:34
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Context {

    private State mState;

    public Context(State state) {
        mState = state;
    }

    public void request(){
        mState.handle(this);
    }

    public State getState() {
        return mState;
    }

    public void setState(State state) {
        mState = state;
        System.out.println("当前状态：" + mState);
    }
}
