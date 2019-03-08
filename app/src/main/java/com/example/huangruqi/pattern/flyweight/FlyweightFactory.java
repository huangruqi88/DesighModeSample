package com.example.huangruqi.pattern.flyweight;

import java.util.Hashtable;

/**
 * @data: 2019/3/8 14:26
 * @author: hrq
 * @Email:
 * @Description:
 */
public class FlyweightFactory {

    private Hashtable<String, ConcreteFlyweight> mHashtable = new Hashtable<>();

    public FlyweightFactory() {
        mHashtable.put("隔壁老王", new ConcreteFlyweight());
        mHashtable.put("隔壁大姐", new ConcreteFlyweight());
        mHashtable.put("对门麻子", new ConcreteFlyweight());
    }

    public ConcreteFlyweight getFlyweight(String key) {
        return mHashtable.get(key);
    }
}
