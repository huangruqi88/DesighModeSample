package com.example.huangruqi.pattern.mediator.sample;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class CPU extends Colleague {

    /**
     * 视频和音频数据
     */
    private String dataVideo,dataSound;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueA 将信息递交给中介者处理！");
    }

    /**
     * 获取视频数据
     * @return
     */
    public String getDataVideo() {
        return dataVideo;
    }

    /**
     * 获取音频数据
     * @return
     */
    public String getDataSound() {
        return dataSound;
    }

    public void decodeData(String data) {
        //分割音、视频数据
        String[] tmp = data.split(",");

        //解析音、视频数据
        dataVideo = tmp[0];
        dataSound = tmp[1];

        //告诉中介者自身状态改变
        mediator.changed(this);

    }
}
