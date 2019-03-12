package com.example.huangruqi.pattern.visitor.sample;

/**
 * @data: 2019/3/11 11:24
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Music extends Web {
    public Music(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 接受访问者的访问
     */
    @Override
    public void download() {
        System.out.println("下载视频！！");
    }

    /**
     * 播放音乐 音乐类独有的
     */
    public void payMusic(){
        System.out.println("播放音乐中…");
    }
}
