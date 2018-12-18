package com.example.huangruqi;

import android.content.Intent;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.huangruqi.Utils.Consonat;
import com.example.huangruqi.adapter.MainAdapter;
import com.example.huangruqi.pattern.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author huangruqi
 */
public class MainActivity extends BaseActivity {


    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    private MainAdapter mMainAdapter;
    private List<String> mDatas;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

        mTvTitle.setText(getString(R.string.design_mode));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mMainAdapter = new MainAdapter();
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,1));
        mRecyclerView.setAdapter(mMainAdapter);

        mMainAdapter.setOnItemClickListener(position -> {

            Intent intent = new Intent(MainActivity.this,ContainerActivity.class);
            intent.putExtra(Consonat.DATE,mDatas.get(position));
            startActivity(intent);
        });
    }

    @Override
    protected void initDate() {
        mDatas = new ArrayList<>();

        mDatas.add("单一职责原则");
        mDatas.add( "开闭原则");
        mDatas.add( "依赖倒置原则");
        mDatas.add( "里氏替换原则");
        mDatas.add( "迪米特法则");
        mDatas.add( "接口隔离原则");
        mDatas.add( "聚合/组合复用");

        mDatas.add( "简单工厂模式");
        mDatas.add( "策略模式");
        mDatas.add( "装饰模式");
        mDatas.add( "代理模式");
        mDatas.add( "工厂方法模式");
        mDatas.add( "原型模式");
        mDatas.add( "模板方法模式");
        mDatas.add( "外观模式");
        mDatas.add( "建造者模式");
        mDatas.add( "观察者模式");
        mDatas.add( "抽象工厂模式");
        mDatas.add( "状态模式");
        mDatas.add( "适配器模式");
        mDatas.add( "备忘录模式");
        mDatas.add( "组合模式");
        mDatas.add( "迭代器模式");
        mDatas.add( "单例模式");
        mDatas.add( "桥接模式");
        mDatas.add( "命令模式");
        mDatas.add( "责任链模式");
        mDatas.add( "中介者模式");
        mDatas.add( "享元模式");
        mDatas.add( "解释器模式");
        mDatas.add( "访问者模式");
        mDatas.add( "迭代子模式");
        mMainAdapter.setDate(mDatas);
    }

}
