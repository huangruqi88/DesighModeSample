package com.example.huangruqi.pattern.abstract_factory.sample;

/**
 * @data: 2019/2/21 16:03
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
