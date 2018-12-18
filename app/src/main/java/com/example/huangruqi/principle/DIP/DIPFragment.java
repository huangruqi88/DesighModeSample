package com.example.huangruqi.principle.DIP;

import android.content.Intent;
import android.widget.TextView;

import com.example.huangruqi.BaseFragment;
import com.example.huangruqi.Utils.Consonat;
import com.example.huangruqi.pattern.R;
import com.example.huangruqi.principle.OCP.Doctor;
import com.example.huangruqi.principle.OCP.PeasantWorker;

import butterknife.BindView;

/**
 * @data 2018/12/15 11:45
 * @author huangruqi
 * @Description:  依赖倒转原则：
 *                      A.高层模块不应该依赖底低模块。两个都应该依赖抽象（Android依赖抽象通常Abstract关键字或者实现接口的方式进行）。
 * 　　　               B.抽象不应该依赖细节。细节应该依赖抽象。
 *
 *              参考链接：https://blog.csdn.net/yabay2208/article/details/73826719
 */
public class DIPFragment extends BaseFragment {

    @BindView(R.id.container)
    TextView mContainer;

    @Override
    protected void initDate() {
        Intent intent = getActivity().getIntent();
        String data = intent.getStringExtra(Consonat.DATE);
        mContainer.setText(data);
        /******************** 依赖倒转原则 ******************************/

        Driver0 zhangsan = new Driver0("张三");
        Benz0 benz0 = new Benz0();
        zhangsan.drive(benz0);

        /******************** 开闭原则 ******************************/

        Driver lisi = new Driver("李四");
        Benz benz = new Benz();
        BMW bmw = new BMW();
        lisi.drive(benz);
        lisi.drive(bmw);
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_container;
    }

}
