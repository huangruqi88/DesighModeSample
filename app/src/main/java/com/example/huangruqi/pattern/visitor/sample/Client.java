package com.example.huangruqi.pattern.visitor.sample;

/**
 * @data: 2019/3/11 14:24
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Music wangYi = new Music("网易云音乐");
        Music kuGou = new Music("酷狗音乐");

        Video youKu = new Video("优酷视频");
        Video aiQiYi = new Video("爱奇艺");

        //将被访问者放入到对象结构中
        Wabsites wabsites = new Wabsites();
        wabsites.addWeb(wangYi);
        wabsites.addWeb(kuGou);
        wabsites.addWeb(youKu);
        wabsites.addWeb(aiQiYi);

        Visitor idler = new Idler("闲人");
        wabsites.accept(idler);

        System.out.println("--------------------------");

        Visitor busy = new Busy("忙人");
        wabsites.accept(busy);

    }

}
