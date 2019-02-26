package com.example.huangruqi.pattern.adapter.smaple;

/**
 * @data: 2019/2/25 15:33
 * @author: 黄汝琪
 * @Email:
 * @Description: Adapter角色，将220V电压转换成5V
 */
public class VoltAdapter extends Volt220 implements FiveVolt{
    @Override
    public int getVolt5() {
        return 5;
    }
}
