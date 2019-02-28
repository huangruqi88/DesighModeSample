package com.example.huangruqi.pattern.iterator.sample;

import java.util.List;

/**
 * @data: 2019/2/28 10:43
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        CompanMan man = new CompanMan();
        List mans = man.getEmployees();

        for (int i = 0; i < mans.size(); i++) {
            System.out.println("集合的索引 = " + i);
            System.out.println(mans.get(i).toString());
        }

        CompanWoMan woMan = new CompanWoMan();
        Employee[] employees = woMan.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println("数组的索引 = " + i);
            System.out.println(employees[i].toString());
        }
    }
}
