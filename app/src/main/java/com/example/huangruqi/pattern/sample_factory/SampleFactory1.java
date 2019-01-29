package com.example.huangruqi.pattern.sample_factory;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.factory
 * @data 2018/11/26 10:41
 *
 * 　优点： 工厂类是整个模式的关键.包含了必要的逻辑判断,根据外界给定的信息,
 *          决定究竟应该创建哪个具体类的对象.通过使用工厂类,外界可以从直接创建具体
 *          产品对象的尴尬局面摆脱出来,仅仅需要负责“消费”对象就可以了。而不必管这
 *          些对象究竟如何创建及如何组织的．明确了各自的职责和权利，有利于整个软件体系结构的优化。
 *   缺点： 由于工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则，
 *          将全部创建逻辑集中到了一个工厂类中；它所能创建的类只能是事先考虑到的，
 *          如果需要添加新的类，则就需要改变工厂类了。当系统中的具体产品类不断增多时候，
 *          可能会出现要求工厂类根据不同条件创建不同实例的需求．这种对条件的判断和对具体产品类型的判断交错在一起，
 *          很难避免模块功能的蔓延，对系统的维护和扩展非常不利；
 */
public class SampleFactory1 {

    private static final String TAG = "SampleFactory1";

    public static Animal createInstence(Class clazz) {
        Animal mAnimal = null;
        try {
            mAnimal = (Animal) Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            Log.e(TAG, "createInstence: -----------不支持抽象类接口 ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mAnimal;
    }
}
