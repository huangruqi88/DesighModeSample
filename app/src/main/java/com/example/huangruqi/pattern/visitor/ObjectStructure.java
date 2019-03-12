package com.example.huangruqi.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2019/3/11 11:03
 * @author: hrq
 * @Email:
 * @Description:
 */
public class ObjectStructure {
    private List<Element> mElements = new ArrayList<>();
    public void attach(Element element){
        mElements.add(element);
    }

    public void detach(Element element){
        mElements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : mElements) {
            element.accept(visitor);
        }
    }
}
