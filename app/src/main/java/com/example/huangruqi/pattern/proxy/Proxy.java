package com.example.huangruqi.pattern.proxy;

/**
 * @data: 2019/1/22 19:35
 * @author: 黄汝琪
 * @Email:
 * @Description: Proxy类，保存一个引用使得可以保存实体，并提供一个Subject的接口相同的接口，
 *                 这样的代理就可以使用实体。
 */
public class Proxy extends Subject {

    RealSubject mRealSubject;
    @Override
    protected void request() {
        if (null == mRealSubject) {
            mRealSubject = new RealSubject();
        }
        mRealSubject.request();
    }
}
