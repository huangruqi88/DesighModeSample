package com.example.huangruqi.pattern.prototype.resume;

/**
 * @data: 2019/1/23 18:55
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Resume {
    private String name;
    private String sex;
    private String age;
    private String timeAre;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    /**
     * 设置个人信息
     *
     * @param sex
     * @param age
     */
    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     * @param timeAre
     * @param company
     */
    public void setWorkeExperience(String timeAre,String company) {
        this.timeAre = timeAre;
        this.company = company;
    }

    public void display(){
        System.out.println("个人信息 name = " + name + ";sex = " + sex + ",age = " + age);
        System.out.println("工作经历 timeAre = " + timeAre + ";company = " + company );
    }
}
