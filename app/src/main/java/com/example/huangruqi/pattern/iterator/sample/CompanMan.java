package com.example.huangruqi.pattern.iterator.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2019/2/28 10:17
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class CompanMan {
    private List<Employee> list = new ArrayList<>();

    public CompanMan() {
        list.add(new Employee("大蛋",18,"男","农民工"));
        list.add(new Employee("二蛋",20,"女","建筑工"));
        list.add(new Employee("隔壁老王",48,"男","老司机"));
        list.add(new Employee("邻居小姐姐",58,"女","唱戏的"));
        list.add(new Employee("小王",25,"男","程序员"));
    }

    public List<Employee> getEmployees() {
        return list;
    }
}
