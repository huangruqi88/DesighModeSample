package com.example.huangruqi;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * author: xiaokang
 * time  : 17/3/29
 * desc  :
 */

public abstract class BaseFragment extends Fragment {

    protected Unbinder mBind;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResID(),container,false);
        mBind = ButterKnife.bind(this, rootView);
        initDate();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    protected abstract void initDate();

    @LayoutRes
   protected abstract int getLayoutResID();

    @Override
    public void onDestroy() {
        super.onDestroy();
        mBind.unbind();
    }
}
