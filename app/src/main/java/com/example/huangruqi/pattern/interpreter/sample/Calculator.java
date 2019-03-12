package com.example.huangruqi.pattern.interpreter.sample;

import java.util.Stack;

/**
 * @data: 2019/3/9 10:45
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Calculator {
    /**
     * 声明一个Stack栈储存并操作所有相关的解释器
     */
    private Stack<ArithmeticExpression> mStack = new Stack<>();

    public Calculator(String expression) {
        //声明两个ArithmeticExpression类型的临时变量，储存运算符左右两边的数字解释器
        ArithmeticExpression expression1,expression2;

        //根据空格分割表达是字符串
        String[] elements = expression.split(" ");
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+':
                    //如果是+号，则栈中的解释器弹出作为运算符号左边的解释器。
                    expression1 = mStack.pop();
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));

                    //通过上面两数字解释器构造加法运算解释器
                    mStack.push(new AdditionExpression(expression1,expression2));
                    break;
                case '-':
                    expression1 = mStack.pop();
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mStack.push(new SubtractionExpression(expression1,expression2));
                    break;
                default:
                    //如果是数字
                    mStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculate(){
        return mStack.pop().interpret();
    }
}
