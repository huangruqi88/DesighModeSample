package com.example.huangruqi.pattern.memento.sample;

/**
 * @data: 2019/2/27 16:36
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Caretaker {
    /**
     * 备忘录
     */
    Memoto mMemoto;

    public void archive(Memoto memoto){
        this.mMemoto = memoto;
    }

    /**
     * 获取存档
     * @return
     */
    public Memoto getMemoto() {
        return mMemoto;
    }
}
