package com.example.huangruqi.pattern.sample_factory.car;

/**
 * @data: 2019/2/16 10:11
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clazz);
}
