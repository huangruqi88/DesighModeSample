package com.example.huangruqi.pattern.template_method.computer;

/**
 * @data: 2019/2/16 10:58
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        AbstractComputer computer = new CoderComputor();
        computer.startUp();
        computer = new MilitaryComputer();
        computer.startUp();
    }
}
