package com.example.huangruqi.principle.LOD;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2018/12/17 18:21
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 分公司管理者
 */
public class SubCompanyManager {

    private static final String TAG = "里氏替换原则";

    /**
     * 获得分公司所有成员的ID
     *
     * @return
     */
    public List<SubEmployee> getAllSubEmployees(){
        List<SubEmployee> subList = new ArrayList<>();
        for (int i = 10; i < 16; i++) {
            SubEmployee sub = new SubEmployee();
            sub.setSubEmpId("分公司成员ID：" + i);
            subList.add(sub);
        }

        return subList;
    }

    /**
     * 打印分公司所有成员ID
     */
    public void printAllSubEmployees(){

        List<SubEmployee> subList = this.getAllSubEmployees();
        for (SubEmployee sub : subList){
            Log.i(TAG, sub.getSubEmpId());
        }
    }
}
