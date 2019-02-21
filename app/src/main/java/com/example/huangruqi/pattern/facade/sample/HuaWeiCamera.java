package com.example.huangruqi.pattern.facade.sample;

/**
 * @data: 2019/2/20 11:19
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class HuaWeiCamera implements Camera{
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
