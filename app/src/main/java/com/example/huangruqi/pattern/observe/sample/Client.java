package com.example.huangruqi.pattern.observe.sample;

/**
 * @data: 2019/2/21 10:45
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //被观察者
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        //观察者
        Coder xiaoWang = new Coder("小王");
        Coder  zhangSan = new Coder("张三");
        Coder liSi = new Coder("李四");
        Coder maZi = new Coder("麻子");

        //将观察者注册到可观察者对象的观察者列表中
        devTechFrontier.addObserver(xiaoWang);
        devTechFrontier.addObserver(zhangSan);
        devTechFrontier.addObserver(liSi);
        devTechFrontier.addObserver(maZi);

        //发布消息
        devTechFrontier.postNewPublication("新的一期开发技术前线周报发布啦！");
    }
}
