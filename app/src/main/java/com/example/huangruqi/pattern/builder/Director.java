package com.example.huangruqi.pattern.builder;

/**
 * @data: 2019/2/20 15:43
 * @author: 黄汝琪
 * @Email:
 * @Description: Director类，负责构建Computer
 */
public class Director {

    Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 快速构建对象
     */
    public void construct(String board,String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }

}
