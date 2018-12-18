package com.example.huangruqi.principle.LOD;

import android.content.Intent;
import android.widget.TextView;

import com.example.huangruqi.BaseFragment;
import com.example.huangruqi.Utils.Consonat;
import com.example.huangruqi.pattern.R;
import com.example.huangruqi.principle.LSP.HandGun;
import com.example.huangruqi.principle.LSP.MachineGun;
import com.example.huangruqi.principle.LSP.RifleGun;
import com.example.huangruqi.principle.LSP.Soldier;

import butterknife.BindView;

/**
 * @author huangruqi
 * @data 2018/12/15 11:45
 * @Description: 迪米特法则：如果两个类不必彼此之间直接通信，那么这连个类就不必直接的相互作用。
 *                      如果一个类调用另外一个类的某一个方法的话，则可以通过第三者转发调用这个调用。
 */
public class LODFragment extends BaseFragment {

    @BindView(R.id.container)
    TextView mContainer;

    @Override
    protected void initDate() {
        Intent intent = getActivity().getIntent();
        String data = intent.getStringExtra(Consonat.DATE);
        mContainer.setText(data);

        /******************** 里氏替换原则 ******************************/
        // 优化前 打印所有成员ID
        CompanyManager companyManager = new CompanyManager();
        companyManager.printAllEmployees(new SubCompanyManager());

        // 优化前 打印所有成员ID
        companyManager.printAllEmployees1(new SubCompanyManager());
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_container;
    }

}
