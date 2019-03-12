package com.example.huangruqi.pattern.interpreter;

/**
 * @data: 2019/3/9 10:16
 * @author: hrq
 * @Email:
 * @Description: 终端（又称终结符）表达式，文法中每一终结符都有一个具体的终结符与之相对应。
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器！");
    }
}
