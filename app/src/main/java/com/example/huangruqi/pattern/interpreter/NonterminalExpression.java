package com.example.huangruqi.pattern.interpreter;

/**
 * @data: 2019/3/9 10:16
 * @author: hrq
 * @Email:
 * @Description: 非终端（又称非终结符）表达式，实现文法中与非终结符有关的解释操作。
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器！");
    }
}
