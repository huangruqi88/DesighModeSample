package com.example.huangruqi.pattern.proxy.virtual;

/**
 * @data: 2019/1/23 10:56
 * @author: 黄汝琪
 * @Email:
 * @Description: 虚拟代理模式  解释：ProxyImage我们隐藏了loadImageFromeDisk(),
 *                                  创建ProxyIamge对象并不会立刻创建RealImage对象，实现了懒加载
 */
public class ProxyImage implements Image {
    private String mFileName;
    private Image mImage;

    public ProxyImage(String fileName) {
        this.mFileName = fileName;
    }

    @Override
    public void displayImage() {
        if (null == mImage) {
            mImage = new RealIamge(mFileName);
        }
        mImage.displayImage();
    }
}
