package com.example.huangruqi.pattern.proxy;

/**
 * @data: 2019/1/22 19:32
 * @author: 黄汝琪
 * @Email:
 * @Description: Subject类，定义了RealSubject和Proxy的公用接口，这样就可以在任何使用
 *                RealSubject的地方都可以使用Proxy
 */
public abstract class Subject {
    protected abstract void request();
}
