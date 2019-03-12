package com.example.huangruqi.pattern.interpreter.sample;

/**
 * @data: 2019/3/9 10:34
 * @author: hrq
 * @Email:
 * @Description: 数字解释器，仅仅为了解释数字
 */
public class NumExpression extends ArithmeticExpression {

    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
