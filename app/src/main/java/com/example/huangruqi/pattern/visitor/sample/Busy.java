package com.example.huangruqi.pattern.visitor.sample;

/**
 * @data: 2019/3/11 14:18
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Busy implements Visitor {

    private String name;

    public Busy(String name) {
        this.name = name;
    }

    @Override
    public void visit(Music music) {
        System.out.println(name + "浏览音乐网站：" + music.getName());
        music.download();
    }

    @Override
    public void visit(Video video) {
        System.out.println(name + "下载音乐网站：" + video.getName());
        video.download();
    }
}
