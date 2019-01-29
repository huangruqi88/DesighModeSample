package com.example.huangruqi.pattern.prototype.resume;

/**
 * @data: 2019/1/23 19:02
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Resume zhangSan = new Resume("张三");
        zhangSan.setPersonInfo("男","23");
        zhangSan.setWorkeExperience("2015 - 2019","二把刀垃圾公司");

        Resume liSi = new Resume("李四");
        liSi.setPersonInfo("女","18");
        liSi.setWorkeExperience("2015 - 2019","二把刀垃圾公司");

        zhangSan.display();
        liSi.display();
    }
}
