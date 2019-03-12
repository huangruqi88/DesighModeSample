package com.example.huangruqi.pattern.visitor.sample;

/**
 * @data: 2019/3/11 11:24
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Video extends Web {
    public Video(String name) {
        super(name);
    }

    /**
     * 接受访问者的访问
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
      visitor.visit(this);
    }

    @Override
    public void download() {
        System.out.println("下载视频！！");
    }

    /**
     * 播放音乐 音乐类独有的
     */
    public void payVideo(){
        System.out.println("播放视频中…");
    }

}
