package com.example.huangruqi.pattern.sate.sample;

/**
 * @data: 2019/2/22 09:51
 * @author: 黄汝琪
 * @Email:
 * @Description: 电视遥控器，类似于经典模式中的 Context
 */
public class TvController implements PowerController {
    //    private static final int POWER_ON = 1;
//    private static final int POWER_OFF = 2;
//    private int mState = POWER_OFF;
//
//    public void powerOn() {
//        mState = POWER_ON;
//        if (mState == POWER_OFF) {
//            System.out.println("打开电视机！");
//        }
//    }
//
//    public void powerOff() {
//        mState = POWER_OFF;
//        if (mState == POWER_ON) {
//            System.out.println("关闭电视机！");
//        }
//    }
//
//    public void nextChannel() {
//        if (mState == POWER_ON) {
//            System.out.println("下一频道");
//        } else {
//            System.out.println("两个红灯提示没有开机！");
//        }
//    }
//
//    public void preChannel() {
//        if (mState == POWER_ON) {
//            System.out.println("上一频道！");
//        } else {
//            System.out.println("两个红灯提示没有开机！");
//        }
//    }
//
//    public void turnUp() {
//        if (mState == POWER_ON) {
//            System.out.println("调高音量！");
//        } else {
//            System.out.println("两个红灯提示没有开机！");
//        }
//    }
//
//    public void turnDown() {
//        if (mState == POWER_ON) {
//            System.out.println("调低音量！");
//        } else {
//            System.out.println("两个红灯提示没有开机！");
//        }
//    }
    private TvState mTvState;

    public void setTvState(TvState tvState) {
        mTvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("电视打开了！");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("电视关闭了！");
    }

    public void nextChannel() {
        if (null != mTvState) {
            mTvState.nextChannel();
        }
    }

    public void preChannel() {
        if (null != mTvState) {
            mTvState.preChannel();
        }
    }

    public void turnUp() {
        if (null != mTvState) {
            mTvState.turnUp();
        }
    }

    public void turnDown() {
        if (null != mTvState) {
            mTvState.turnDown();
        }
    }
}
