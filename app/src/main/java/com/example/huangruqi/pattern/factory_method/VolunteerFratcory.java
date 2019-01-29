package com.example.huangruqi.pattern.factory_method;

/**
 * @data: 2019/1/23 15:41
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class VolunteerFratcory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
