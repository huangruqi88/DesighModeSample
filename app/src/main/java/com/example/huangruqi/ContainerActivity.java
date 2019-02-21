package com.example.huangruqi;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.huangruqi.utils.Consonat;
import com.example.huangruqi.pattern.R;
import com.example.huangruqi.principle.CRP.CRPFragment;
import com.example.huangruqi.principle.ISP.ISPFragment;
import com.example.huangruqi.principle.LOD.LODFragment;
import com.example.huangruqi.principle.LSP.LSPFragment;
import com.example.huangruqi.principle.OCP.OCPFragment;
import com.example.huangruqi.principle.SRP.SRPFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author huangruqi
 */
public class ContainerActivity extends BaseActivity {


    Fragment mFragment;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.container)
    FrameLayout container;
    private String mData;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_container;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initDate() {
        Intent intent = getIntent();
        mData = intent.getStringExtra(Consonat.DATE);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (mData) {
            case "单一职责原则":
                if (null == mFragment) {
                    mFragment = new SRPFragment();
                }
                transaction.replace(R.id.container, mFragment);
                break;
            case "开闭原则":
                if (null == mFragment) {
                    mFragment = new OCPFragment();
                }
                transaction.replace(R.id.container, mFragment);
                break;
            case "依赖倒转原则":
                if (null == mFragment) {
                    mFragment = new SRPFragment();
                }
                transaction.replace(R.id.container, mFragment);
                break;
            case "里氏替换原则":
                if (null == mFragment) {
                    mFragment = new LSPFragment();
                }
                transaction.replace(R.id.container, mFragment);
                break;
            case "迪米特法则":
                if (null == mFragment) {
                    mFragment = new LODFragment();
                }
                transaction.replace(R.id.container, mFragment);
                break;
            case "接口隔离原则":
                if (null == mFragment) {
                    mFragment = new ISPFragment();
                }
                transaction.replace(R.id.container, mFragment);
                break;
            case "聚合/组合复用":
                if (null == mFragment) {
                    mFragment = new CRPFragment();
                }
                transaction.replace(R.id.container, mFragment);
                break;
            case "简单工厂模式":
                if (null == mFragment) {
                    mFragment = new CRPFragment();
                }
                transaction.replace(R.id.container, mFragment);
                break;
            default:
                break;
        }
//        transaction.show(mFragment);
        transaction.commitAllowingStateLoss();

    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        onBackPressed();
    }
}
