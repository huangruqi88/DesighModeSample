package com.example.huangruqi.pattern.responsibility.sample1;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class Leader {
    /**
     * 上一级的处理者
     */
    protected Leader nextLeader;

    public final void handlerRequest(int meobey) {
        if (meobey <= limit()) {
            handle(meobey);
        } else {
            if (null != nextLeader) {
                nextLeader.handlerRequest(meobey);
            }
        }
    }

    /**
     * 自身能审批的额度权限
     * @return 额度
     */
    public abstract int limit();

    /**
     * 处理报账的行为
     * @param money 具体金额
     */
    public abstract void handle(int money);
}
