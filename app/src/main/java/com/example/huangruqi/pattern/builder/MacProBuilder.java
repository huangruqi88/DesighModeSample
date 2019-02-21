package com.example.huangruqi.pattern.builder;


/**
 * @data: 2019/2/20 15:40
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class MacProBuilder extends Builder {
    private Computer mComputer = new MacPro();
    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer    ;
    }
}
