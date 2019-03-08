package com.example.huangruqi.pattern.mediator.sample;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class GraphicsCard extends Colleague {

    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放视频
     * @param data
     */
    public void videoPlay(String data){
        System.out.println("视频：" + data);
    }
}
