package com.example.huangruqi.pattern.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2019/2/28 14:55
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Company {
    private List<Staff> mList = new ArrayList<>();
    public void addStaff(Staff staff){
        mList.add(staff);
    }

    public void showAllStaff(){
        for (Staff staff : mList) {
            System.out.println("Obj : " + staff.toString());
        }
    }
}
