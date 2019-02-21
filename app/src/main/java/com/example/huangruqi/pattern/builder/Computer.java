package com.example.huangruqi.pattern.builder;

/**
 * @data: 2019/2/20 15:24
 * @author: 黄汝琪
 * @Email:
 * @Description: 计算机的抽象类，即Producr角色
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    /**
     * 设置CPU核心数
     *
     * @param board
     */
    public void setBoard(String board) {
        mBoard = board;
    }

    /**
     * 设置内存
     *
     * @param display
     */
    public void setDisplay(String display) {
        mDisplay = display;
    }

    /**
     * 设置操作系统
     */
    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer [mBoard = " + mBoard + " ,mDisplay = " + mDisplay + " ,mOS = " + mOS + "]";
    }
}
