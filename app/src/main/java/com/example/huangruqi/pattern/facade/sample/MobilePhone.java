package com.example.huangruqi.pattern.facade.sample;

/**
 * @data: 2019/2/20 11:13
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new HuaWeiCamera();

    public void call(){
        mPhone.call();
    }

    public void videoChat(){
        System.out.println("--> 视频聊天接通中。");
        mCamera.open();
        mPhone.call();
    }

    public void hangup(){
        mPhone.hangup();
    }

    public void takePicture(){
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera(){
        mCamera.close();
    }
}
