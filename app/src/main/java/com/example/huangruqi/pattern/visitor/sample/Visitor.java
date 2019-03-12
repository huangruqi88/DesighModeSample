package com.example.huangruqi.pattern.visitor.sample;

/**
 * @data: 2019/3/11 11:23
 * @author: hrq
 * @Email:
 * @Description:
 */
public interface Visitor {

    /**
     * 为每一个元素声明一个访问者方法。
     */
    void visit(Music music);
    /**
     * 为每一个元素声明一个访问者方法。
     */
    void visit(Video video);

}
