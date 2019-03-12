package com.example.huangruqi.pattern.interpreter;

/**
 * @data: 2019/3/9 10:14
 * @author: hrq
 * @Email:
 * @Description: 上下文环境类，包含解释器之外的全局信息
 */
public class Context {
    private String inPut;
    private String outPut;

    public String getInPut() {
        return inPut;
    }

    public void setInPut(String inPut) {
        this.inPut = inPut;
    }

    public String getOutPut() {
        return outPut;
    }

    public void setOutPut(String outPut) {
        this.outPut = outPut;
    }
}
