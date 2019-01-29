package com.example.huangruqi.pattern.prototype;

import android.content.Intent;

/**
 * @data: 2019/1/23 19:30
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //1.构建文档对象
        WordDocument document = new WordDocument();
        //2.编辑文档，添加图片等。
        document.setText("第一篇文档");
        document.addImage("图片1");
        document.addImage("图片2");
        document.addImage("图片3");
        document.showDocument();

        //以原始文档为原型，copy一份副本
        WordDocument document1 = document.clone();
        document1.setText("copy的第一份文档");
        document1.addImage("哈哈.jpg");
        document1.showDocument();

        document.showDocument();

    }
}
