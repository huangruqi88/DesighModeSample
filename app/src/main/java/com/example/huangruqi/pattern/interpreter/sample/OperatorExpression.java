package com.example.huangruqi.pattern.interpreter.sample;

/**
 * @data: 2019/3/9 10:35
 * @author: hrq
 * @Email:
 * @Description: 运算符号的解释器，为所有运算符号解释器共性提取
 */
public abstract class OperatorExpression extends ArithmeticExpression {

    protected ArithmeticExpression mExpression1,mExpression2;

    public OperatorExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
        mExpression1 = expression1;
        mExpression2 = expression2;
    }

}
