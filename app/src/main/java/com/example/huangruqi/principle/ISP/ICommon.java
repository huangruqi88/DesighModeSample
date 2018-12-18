package com.example.huangruqi.principle.ISP;

/**
 * @data: 2018/12/17 18:35
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 单一的接口
 */
public interface ICommon {
    /**
     * 有线
     */
    void wired();

    /**
     * 发送短信
     */
    void sendMessage();

    /**
     * 拨打电话
     */
    void calling();

    /**
     * 听音乐
     */
    void listenToMusic();

    /**
     * 观看视频
     */
    void watchVideos();
}
