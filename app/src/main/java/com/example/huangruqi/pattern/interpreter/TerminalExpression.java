package com.example.huangruqi.pattern.interpreter;

/**
 * @data: 2019/3/9 10:16
 * @author: hrq
 * @Email:
 * @Description:
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器！");
    }
}
