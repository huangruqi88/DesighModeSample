package com.example.huangruqi.pattern.facade.sample;

/**
 * @data: 2019/2/20 11:22
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.takePicture();
        phone.videoChat();
    }
}
