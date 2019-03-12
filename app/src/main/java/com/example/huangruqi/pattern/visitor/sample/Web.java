package com.example.huangruqi.pattern.visitor.sample;

/**
 * @data: 2019/3/11 11:20
 * @author: hrq
 * @Email:
 * @Description:
 */
public abstract class Web {
    public String name;

    public Web(String name) {
        this.name = name;
    }

    /**
     * 定义一个抽象的访问方法
     */
    public abstract void accept(Visitor visitor);

    /**
     * 下载的方法
     */
    public abstract void download();

    public String getName() {
        return name;
    }
}
