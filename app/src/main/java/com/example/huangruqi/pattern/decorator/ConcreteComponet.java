package com.example.huangruqi.pattern.decorator;

import android.util.Log;

/**
 * @data: 2018/12/24 18:00
 * @author: 黄汝琪
 * @Email:
 * @Description: 装饰设计模式
 */
public class ConcreteComponet extends Component {
    private static final String TAG = "装饰模式";
    @Override
    public void operation() {
        Log.d(TAG, "具体的对象操作 ");
    }
}
