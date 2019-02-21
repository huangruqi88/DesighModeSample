package com.example.huangruqi.pattern.builder;

/**
 * @data: 2019/2/20 15:35
 * @author: 黄汝琪
 * @Email:
 * @Description: 抽象的builder类
 */
public abstract class Builder {
    /**
     * 设置主机
     * @param board
     */
    public abstract void buildBoard(String board);

    /**
     * 设置显示器
     * @param display
     */
    public abstract void buildDisplay(String display);

    /**
     * 设置系统
     */
    public abstract void buildOS();

    /**
     * 创建电脑
     */
    public abstract Computer create();
}
