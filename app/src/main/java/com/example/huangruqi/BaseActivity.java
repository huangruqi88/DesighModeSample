package com.example.huangruqi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Activity的基类
 * @author huangruqi
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        init();
        initDate();
    }

    /**
     * 初始化数据
     */
    protected abstract void initDate();

    /**
     * 初始化
     */
    @SuppressLint("SupportAnnotationUsage")
    @LayoutRes
    protected abstract void init();

    /**
     * 加载布局文件的Id
     * @return
     */
    protected abstract int getLayoutId();
}
