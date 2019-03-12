package com.example.huangruqi.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2019/3/9 10:19
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());

        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }
}
