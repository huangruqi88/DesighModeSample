package com.example.huangruqi.principle.LOD;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2018/12/17 18:18
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 总公司管理者
 */
public class CompanyManager {

    private static final String TAG = "里氏替换原则";

    /**
     * 获得总公司所有成员的ID
     *
     * @return
     */
    public List<Employee> getAllEmployees(){
        List<Employee> empList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Employee employee = new Employee();
            employee.setEmpId("总公司成员ID：" + i);
            empList.add(employee);
        }
        return empList;
    }

    /**
     * 打印所有成员ID
     *
     * @param subMgr 分公司管理者
     */
    public void  printAllEmployees(SubCompanyManager subMgr){

        Log.d(TAG, "printAllEmployees: 打印所有成员ID");

        Log.d(TAG, "总公司员工ID -> 开始打印");
        List<Employee> empList = this.getAllEmployees();
        for (Employee emp : empList){
            Log.i(TAG, emp.getEmpId());
        }

        Log.d(TAG, "分公司员工ID -> 开始打印");
        List<SubEmployee> subList = subMgr.getAllSubEmployees();
        for (SubEmployee sub : subList){
            Log.d(TAG, sub.getSubEmpId());
        }

    }

    /**
     * 打印所有成员ID
     *
     * @param subMgr 分公司管理者
     */
    public void printAllEmployees1(SubCompanyManager subMgr){

        Log.d(TAG, "printAllEmployees: 打印所有成员ID");

        Log.d(TAG, "总公司员工ID -> 开始打印");
        List<Employee> empList = this.getAllEmployees();
        for (Employee emp : empList){
            Log.d(TAG, emp.getEmpId());
        }

        Log.d(TAG, "分公司员工ID -> 开始打印");
        subMgr.printAllSubEmployees();


    }
}
