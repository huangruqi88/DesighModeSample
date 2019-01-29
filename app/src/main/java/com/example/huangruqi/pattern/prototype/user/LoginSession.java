package com.example.huangruqi.pattern.prototype.user;

/**
 * @data: 2019/1/25 19:40
 * @author: 黄汝琪
 * @Email:
 * @Description: 登录session
 */
public class LoginSession {
    static LoginSession sLoginSession = null;
    /**
     * 已登录用户
     */
    private User loginedUser;

    public LoginSession() {
    }

    public static LoginSession getLoginSession(){
        if (sLoginSession == null) {
            sLoginSession =  new LoginSession();
        }
        return sLoginSession;
    }
    //记录用户的信息不对外开放
   public void setLoginedUser(User user){
        loginedUser = user;
    }

    public User getLoginedUser() {
        return loginedUser;
    }
}
