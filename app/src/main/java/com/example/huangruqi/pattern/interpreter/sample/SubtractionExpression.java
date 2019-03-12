package com.example.huangruqi.pattern.interpreter.sample;

/**
 * @data: 2019/3/9 10:38
 * @author: hrq
 * @Email:
 * @Description: 加法运算抽象解释器
 */
public class SubtractionExpression extends OperatorExpression {
    public SubtractionExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return mExpression1.interpret() - mExpression2.interpret();
    }
}
