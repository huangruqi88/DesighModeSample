package com.example.huangruqi.principle.ISP;

/**
 * @data: 2018/12/17 18:39
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 手机不同于座机的功能
 */
public interface ICommon3 {

    /**
     * 发送短信
     */
    void sendMessage();

    /**
     * 听音乐
     */
    void listenToMusic();

    /**
     * 观看视频
     */
    void watchVideos();
}
