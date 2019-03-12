package com.example.huangruqi.pattern.interpreter.sample;

/**
 * @data: 2019/3/9 10:29
 * @author: hrq
 * @Email:
 * @Description: 算数运算的解释器基类
 */
public abstract class ArithmeticExpression {

    /**
     * 抽象的解析方法
     * @return 解析得到的具体的值
     */
    public abstract int interpret();
}
