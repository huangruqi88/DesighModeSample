package com.example.huangruqi.pattern.mediator.sample;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class CDDevice extends Colleague {

    /**
     * 视频和音频数据
     */
    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueA 将信息递交给中介者处理！");
    }


    /**
     * 读取视频数据
     * @return
     */
    public String read(){

        return data;
    }

    public void load(){
        //在实际情况中视频数据与音频数据都在一个数据流中
        data = "视频数据，音频数据";

        //通知中介者 也就是主板数据发生改变
        mediator.changed(this);
    }

}
