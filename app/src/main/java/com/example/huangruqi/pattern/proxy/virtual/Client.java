package com.example.huangruqi.pattern.proxy.virtual;

/**
 * @data: 2019/1/23 11:00
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Image image0 = new ProxyImage("picture_1");
        Image image1 = new ProxyImage("picture_1");
        image0.displayImage();
        image1.displayImage();
    }
}
