package com.example.huangruqi.principle.LSP;

/**
 * @data: 2018/12/17 17:46
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 枪的基类
 */
public abstract class BaseGun {

    /**
     * 枪支的特点
     */
    abstract void gunZoom();

    /**
     * 枪支射击的特点
     */
    abstract void characteristic();

    /**
     * 枪支射击的方法
     */
    abstract void shoot();
}
