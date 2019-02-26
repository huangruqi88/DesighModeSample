package com.example.huangruqi.pattern.sate;

/**
 * @data: 2019/2/22 09:33
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public interface State {
    /**
     * 分发状态
     * @param context 上下文
     */
    void handle(Context context);
}
