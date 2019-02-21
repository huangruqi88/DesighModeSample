package com.example.huangruqi.pattern.sample_factory.car;

/**
 * @data: 2019/2/16 10:15
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class AudiCarFractory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clazz) {
        AudiCar car = null;
        try {
            car = (AudiCar) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
