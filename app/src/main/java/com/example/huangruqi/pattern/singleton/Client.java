package com.example.huangruqi.pattern.singleton;

/**
 * @data: 2019/2/28 15:00
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Company company = new Company();
        //CEO对象只能通过getCeo函数获取
        Staff ceo1 = CEO.getInstance();
        Staff ceo2 = CEO.getInstance();

        company.addStaff(ceo1);
        company.addStaff(ceo2);

        //通过new 创建VP对象
        Staff vp1 = new VP();
        Staff vp2 = new VP();

        //通过new 创建Staff对象
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        company.addStaff(vp1);
        company.addStaff(vp2);
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);

        company.showAllStaff();


        //枚举单例创建
        SingleClazz singleClazz = SingletonEnum.INSTANCE.getInstance();
    }
}
