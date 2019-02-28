package com.example.huangruqi.pattern.iterator.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2019/2/28 10:17
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class CompanWoMan {
    private Employee[] array = new Employee[3];

    public CompanWoMan() {
        array[0] = new Employee("刘邦",2008,"男","二流子");
        array[1] = new Employee("朱元璋",538,"男","农民工");
        array[2] = new Employee("甄嬛",216,"女","白富美");
    }

    public Employee[] getEmployees() {
        return array;
    }
}
