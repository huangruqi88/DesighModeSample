package com.example.huangruqi.pattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @data: 2019/2/28 16:09
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class SingletonManager {
    private static Map<String,Object> sObjectMap = new HashMap<>();

    private SingletonManager() {
    }

    public static void registerService(String key,Object instance){
        if (!sObjectMap.containsKey(key)) {
            sObjectMap.put(key,instance);
        }
    }

    public static Object getService(String key) {
        return sObjectMap.get(key);
    }
}
