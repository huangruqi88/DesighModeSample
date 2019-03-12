package com.example.huangruqi.pattern.visitor.sample;

/**
 * @data: 2019/3/11 14:14
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Idler implements Visitor {

    private String name;

    public Idler(String name) {
        this.name = name;
    }

    @Override
    public void visit(Music music) {
        System.out.println(name + "浏览音乐网站：" + music.getName());
        music.payMusic();
    }

    @Override
    public void visit(Video video) {
        System.out.println(name + "浏览视频网站：" + video.getName());
        video.payVideo();
    }
}
