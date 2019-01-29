package com.example.huangruqi.pattern.prototype.user;

/**
 * @data: 2019/1/25 19:38
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class LoginImpl implements Login {
    @Override
    public void login() {
        //登录到服务器，获取用户信息
        User user = new User();
        //将服务器返回的完整信息设置给User对象
        user.age = 20;
        user.name = "麻子脸";
        user.address = new Address("余杭","联盟南区","公测第二个坑");

        LoginSession.getLoginSession().setLoginedUser(user);
    }
}

