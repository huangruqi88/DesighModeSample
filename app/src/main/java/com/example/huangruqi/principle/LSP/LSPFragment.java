package com.example.huangruqi.principle.LSP;

import android.content.Intent;
import android.widget.TextView;

import com.example.huangruqi.BaseFragment;
import com.example.huangruqi.Utils.Consonat;
import com.example.huangruqi.pattern.R;
import com.example.huangruqi.principle.OCP.Doctor;
import com.example.huangruqi.principle.OCP.PeasantWorker;
import com.example.huangruqi.principle.OCP.Person;

import butterknife.BindView;

/**
 * @author huangruqi
 * @data 2018/12/15 11:45
 * @Description: 里氏替换原则（LSP）:　子类型必须能够替换掉他的父类型（一个软件实体如果使用的是一个父类的话，
 *                     那么一定适用于其子类，而且它觉察不出父类对象和子类对象的区别。
 *                     也就是说在软件里面把父类都替换成它的子类，程序的行为没有任何变化）。
 */
public class LSPFragment extends BaseFragment {

    @BindView(R.id.container)
    TextView mContainer;

    @Override
    protected void initDate() {
        Intent intent = getActivity().getIntent();
        String data = intent.getStringExtra(Consonat.DATE);
        mContainer.setText(data);

        /******************** 里氏替换原则 ******************************/
        Soldier soldier = new Soldier();

        // 士兵使用手枪进行射击
        soldier.setGun(new HandGun());
        soldier.startShoot();

        // 士兵使用步枪进行射击
        soldier.setGun(new RifleGun());
        soldier.startShoot();

        // 士兵使用机枪进行射击
        soldier.setGun(new MachineGun());
        soldier.startShoot();
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_container;
    }

}
