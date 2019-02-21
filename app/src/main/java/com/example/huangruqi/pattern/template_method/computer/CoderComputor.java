package com.example.huangruqi.pattern.template_method.computer;

/**
 * @data: 2019/2/16 10:46
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class CoderComputor extends AbstractComputer {
    @Override
    void login() {
        System.out.println("程序员只需要进行用户和密码验证就可以了");
    }
}
