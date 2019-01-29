package com.example.huangruqi.pattern.proxy.girl;

/**
 * @data: 2019/1/22 19:04
 * @author: 黄汝琪
 * @Email:
 * @Description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        BeautifulGirl girl = new BeautifulGirl();
        girl.setName("姑娘小芳");

        Proxy proxy = new Proxy(girl);
        proxy.giveWatch();
        proxy.giveChocolate();
        proxy.giveFlowers();
    }
}
