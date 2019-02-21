package com.example.huangruqi.pattern.template_method.computer;

/**
 * @data: 2019/2/16 10:56
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class MilitaryComputer extends AbstractComputer {
    @Override
    void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }

    @Override
    void login() {
        super.login();
        System.out.println("进行指纹识别等复杂的用户验证");
    }
}
