package com.example.huangruqi.pattern.sate.sample;

/**
 * @data: 2019/2/22 10:24
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public interface TvState {
    /**
     * 下一个频道
     */
    void nextChannel();

    /**
     * 上一个频道
     */
    void preChannel();

    /**
     * 上调音量
     */
    void turnUp();

    /**
     * 下调音量
     */
    void turnDown();
}
