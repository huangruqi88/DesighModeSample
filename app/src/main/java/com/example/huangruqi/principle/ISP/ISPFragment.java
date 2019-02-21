package com.example.huangruqi.principle.ISP;

import android.content.Intent;
import android.util.Log;
import android.widget.TextView;

import com.example.huangruqi.BaseFragment;
import com.example.huangruqi.utils.Consonat;
import com.example.huangruqi.pattern.R;

import butterknife.BindView;

/**
 * @author huangruqi
 * @data 2018/12/15 11:45
 * @Description: 迪米特法则：如果两个类不必彼此之间直接通信，那么这连个类就不必直接的相互作用。
 *                      如果一个类调用另外一个类的某一个方法的话，则可以通过第三者转发调用这个调用。
 */
public class ISPFragment extends BaseFragment {

    private static final String TAG = "接口隔离";

    @BindView(R.id.tv_container)
    TextView mTvContainer;

    @Override
    protected void initDate() {
        Intent intent = getActivity().getIntent();
        String data = intent.getStringExtra(Consonat.DATE);
        mTvContainer.setText(data);

        /******************** 里氏替换原则 ******************************/
        // 富人使用手机 发送短信、拨打电话、听音乐和看视频
        Log.d(TAG, "富人 使用手机 发送短信、拨打电话、听音乐和看视频");
        WealthMan wealthMan = new WealthMan();
        wealthMan.sendMsg(new Mobile());
        wealthMan.call(new Mobile());
        wealthMan.music(new Mobile());
        wealthMan.video(new Mobile());

        // 穷人使用座机 有线、拨打电话
        Log.d(TAG, "穷人 使用座机 有线、拨打电话");
        PoorMan poorMan = new PoorMan();
        poorMan.isWired(new Phone());
        poorMan.call(new Phone());

        // 优化后
        Log.d(TAG, "优化后-----");
        Log.d(TAG, "富人1 使用手机 发送短信、拨打电话、听音乐和看视频");
        WealthMan1 wealthMan1 = new WealthMan1();
        wealthMan1.sendMsg(new Mobile1());
        wealthMan1.call(new Mobile1());
        wealthMan1.music(new Mobile1());
        wealthMan1.video(new Mobile1());

        Log.d(TAG, "穷人1 使用座机 有线、拨打电话");
        PoorMan1 poorMan1 = new PoorMan1();
        poorMan1.isWired(new Phone1());
        poorMan1.call(new Phone1());
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_container;
    }

}
