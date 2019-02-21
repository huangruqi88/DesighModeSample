package com.example.huangruqi.principle.SRP;

import android.content.Intent;
import android.widget.TextView;

import com.example.huangruqi.BaseFragment;
import com.example.huangruqi.utils.Consonat;
import com.example.huangruqi.pattern.R;

import butterknife.BindView;

/**
 * @author huangruqi
 * @Description: 单一职责页   一个类中有且仅有一个引起他变化的原因。
 * @data 2018/12/15 11:45
 */
public class SRPFragment extends BaseFragment {

    @BindView(R.id.tv_container)
    TextView mTvContainer;

    @Override
    protected void initDate() {
        Intent intent = getActivity().getIntent();
        String data = intent.getStringExtra(Consonat.DATE);
        mTvContainer.setText(data);
        /******************** 职责过多 ******************************/
        Persion persion = new Persion();
        persion.doctor();
        persion.peasantWorker();
        persion.programmer();
        /******************** 单一职责 ******************************/

        Doctor doctor = new Doctor();
        doctor.doctor();

        PeasantWorker peasantWorker = new PeasantWorker();
        peasantWorker.peasantWorker();

        Programmer programmer = new Programmer();
        programmer.programmer();
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_container;
    }

}
