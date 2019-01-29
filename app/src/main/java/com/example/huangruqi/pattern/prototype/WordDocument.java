package com.example.huangruqi.pattern.prototype;

import java.util.ArrayList;

/**
 * @data: 2019/1/23 19:21
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mList = new ArrayList<>();

    public WordDocument() {
        System.out.println("----------WordDocument-------构造函数---");
    }

    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            //深复制处理
            doc.mList = (ArrayList<String>) this.mList.clone();
            return doc;
        } catch (Exception e) {
        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public ArrayList<String> getList() {
        return mList;
    }

    public void addImage(String image) {
        this.mList.add(image);
    }

    public void showDocument() {
        System.out.println("------------World Content Start --------");
        System.out.println("mText : " + mText);
        for (String imageName : mList) {
            System.out.println("imageName = " + imageName);
        }
        System.out.println("------------World Content End --------");
    }
}
