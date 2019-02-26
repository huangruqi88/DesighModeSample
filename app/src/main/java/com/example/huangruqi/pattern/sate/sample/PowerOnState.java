package com.example.huangruqi.pattern.sate.sample;

/**
 * @data: 2019/2/22 10:31
 * @author: 黄汝琪
 * @Email:
 * @Description:  开机状态此时出发开机功能不做任何操作
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void preChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
