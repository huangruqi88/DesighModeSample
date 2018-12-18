package com.example.huangruqi.principle.LSP;

/**
 * @data: 2018/12/17 17:49
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 士兵实现类
 */
public class Soldier {

    private BaseGun gun;

    public void setGun(BaseGun gun) {
        this.gun = gun;
    }

    public void startShoot(){
        this.gun.gunZoom();
        this.gun.characteristic();
        this.gun.shoot();
    }
}
