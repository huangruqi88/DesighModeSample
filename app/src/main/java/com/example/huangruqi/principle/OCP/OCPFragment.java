package com.example.huangruqi.principle.OCP;

import android.content.Intent;
import android.widget.TextView;

import com.example.huangruqi.BaseFragment;
import com.example.huangruqi.Utils.Consonat;
import com.example.huangruqi.pattern.R;

import butterknife.BindView;

/**
 * @author huangruqi
 * @Description: 开闭原则 软件实体（类、模块、函数等等）可以扩展，但是不可以修改。
 * @data 2018/12/15 11:45
 */
public class OCPFragment extends BaseFragment {

    @BindView(R.id.tv_container)
    TextView mTvContainer;


    @Override
    protected void initDate() {
        Intent intent = getActivity().getIntent();
        String data = intent.getStringExtra(Consonat.DATE);
        mTvContainer.setText(data);
        /******************** 非开闭原则 ******************************/
        Person person = new Person();
        person.doctor();
        person.doctor();
        person.son();
        /******************** 开闭原则 ******************************/

        Doctor doctor = new Doctor();
        doctor.doctor();
        doctor.man();
        doctor.son();
        //对于修改是关闭的，对于扩展是开放的
        PeasantWorker peasantWorker = new PeasantWorker();
        peasantWorker.peasantWorker();
        peasantWorker.man();
        peasantWorker.son();
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_container;
    }

}
