package com.example.huangruqi.pattern.decorator;

/**
 * @data: 2018/12/24 18:14
 * @author: 黄汝琪
 * @Email:
 * @Description: 装饰设计模式 装饰的抽象类
 */
public class Decorator extends Component {
    protected Component mComponent;

    /**
     * 设置Component
     * @param component
     */
    public void setComponent(Component component) {
        mComponent = component;
    }

    /**
     * 重写operation方法，实际执行的是Component的operation
     */
    @Override
    public void operation() {
        if (null != mComponent) {
            mComponent.operation();
        }
    }
}
