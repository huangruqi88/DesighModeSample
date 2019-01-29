package com.example.huangruqi.pattern.sample_factory;

import android.content.Intent;
import android.widget.TextView;

import com.example.huangruqi.BaseFragment;
import com.example.huangruqi.pattern.R;
import com.example.huangruqi.principle.CRP.Airfoil;
import com.example.huangruqi.principle.CRP.Plane;
import com.example.huangruqi.principle.CRP.RailwayCarriage;
import com.example.huangruqi.principle.CRP.Train;
import com.example.huangruqi.utils.Consonat;

import butterknife.BindView;

/**
 * @author huangruqi
 * @data 2018/12/15 11:45
 * @Description:
 */
public class SampleFactoryFragment extends BaseFragment {

    @BindView(R.id.tv_container)
    TextView mTvContainer;

    @Override
    protected void initDate() {
        Intent intent = getActivity().getIntent();
        String data = intent.getStringExtra(Consonat.DATE);
        mTvContainer.setText(data);
        Animal dog = SampleFactory.createInstence("Cat");
        dog.eat();

        Animal cat = SampleFactory1.createInstence(Cat.class);
        cat.sleep();
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_container;
    }

}
