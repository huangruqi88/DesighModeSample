package com.example.huangruqi.principle.CRP;

import android.content.Intent;
import android.widget.TextView;

import com.example.huangruqi.BaseFragment;
import com.example.huangruqi.Utils.Consonat;
import com.example.huangruqi.pattern.R;

import butterknife.BindView;

/**
 * @author huangruqi
 * @data 2018/12/15 11:45
 * @Description: 合成/聚合复用原则：在一个新的对象里使用一些已有的对象,使之成为新对象的一部分。
 * 新的对象通过向这些对象的委派达到复用已有功能的目的。
 * 　　　      解释：要尽量使用组合/聚合，尽量不要使用类继承。
 * 　　　　    聚合（has-a）：是关联关联关系的一种，是一种强关联关系。聚合关系是整体和个体/部分
 * 之间的关系，关联关系的两个类是处于同一个层次上；而聚合关系上的两个类处于
 * 不同层次上，一个是整体，一个是个体/部分。在聚合关系中代表个体/部分的对象
 * 可能会被多个代表整体的对象所共享。
 * 　　　　    组合（like-a）：也是关联关系的一种，但他是比聚合关系更强的关系。聚合关系中代表整
 * 体的对象要负责代表个体/部分对象的整个生命周期，组合关系不能共享。在组合
 * 关系中，如果代表整体的对象呗破坏，那么代表个体/部分的对象呢也一定会呗销
 * 毁或破坏（典型代表就是一个类中如果有匿名内部类，那个这个类被销毁，那么
 * 这个匿名内部类也会被销毁）；而在聚合关系中，代表个体/部分的对象则有可能
 * 会被多个代表整体的对象所共享，而不一定会随着某个代表整体的对象被销毁或者
 * 破坏而被销毁或者破坏。
 */
public class CRPFragment extends BaseFragment {

    @BindView(R.id.container)
    TextView mContainer;

    @Override
    protected void initDate() {
        Intent intent = getActivity().getIntent();
        String data = intent.getStringExtra(Consonat.DATE);
        mContainer.setText(data);
        //组合/聚合：是通过获得其他对象的引用，在运行时刻动态定义的，也就是在一个对象中
        // 保存其他对象的属性，这种方式要求对象有良好定义的接口，并且这个接口也不经常发生改变，
        // 而且对象只能通过接口来访问，这样我们并不破坏封装性，所以只要类型一致，运行时还可以通过
        // 一个对象替换另外一个对象。

        /******************** 合成/聚合复用原则 ******************************/

        //复用（组合）是整体与部分的关系，整体离不开部分，部分离开了整体没有意义，如飞机翅膀与飞机的关系。
        Plane plane = new Plane();
        plane.setAirfoil(new Airfoil());
        plane.fly();

        //聚合 也是整体与部分的关系，但整体可以分离部分，部分也可以离开整体，如火车与车厢的关系。
        Train train = new Train();
        train.setRailwayCarriage(new RailwayCarriage());
        train.carry();

    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_container;
    }

}
