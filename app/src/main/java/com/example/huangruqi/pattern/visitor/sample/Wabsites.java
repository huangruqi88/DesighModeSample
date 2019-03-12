package com.example.huangruqi.pattern.visitor.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @data: 2019/3/11 14:21
 * @author: hrq
 * @Email:
 * @Description:  创建对象结构
 */
public class Wabsites {

    private List<Web> mWebs = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Web> iterator = mWebs.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addWeb(Web web) {
        mWebs.add(web);
    }
}
