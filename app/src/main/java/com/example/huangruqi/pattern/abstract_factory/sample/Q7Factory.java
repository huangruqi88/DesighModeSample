package com.example.huangruqi.pattern.abstract_factory.sample;

/**
 * @data: 2019/2/21 16:03
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngin();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
