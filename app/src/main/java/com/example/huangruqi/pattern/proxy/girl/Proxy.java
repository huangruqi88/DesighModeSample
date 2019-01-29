package com.example.huangruqi.pattern.proxy.girl;

/**
 * @data: 2019/1/22 19:15
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Proxy implements GiveGift {

    Pursuit mPursuit;

    public Proxy(BeautifulGirl girl) {
        mPursuit = new Pursuit(girl);
    }

    @Override
    public void giveWatch() {
        mPursuit.giveWatch();
    }

    @Override
    public void giveFlowers() {
        mPursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        mPursuit.giveChocolate();
    }
}
