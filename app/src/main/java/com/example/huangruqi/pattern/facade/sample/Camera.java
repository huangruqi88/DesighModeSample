package com.example.huangruqi.pattern.facade.sample;

/**
 * @data: 2019/2/20 11:15
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public interface Camera {
    /**
     * 打开照相机
     */
    void open();

    /**
     * 拍照
     */
    void takePicture();

    /**
     * 关闭照相机
     */
    void close();
}
