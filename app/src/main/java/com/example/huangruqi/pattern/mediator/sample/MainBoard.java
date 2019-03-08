package com.example.huangruqi.pattern.mediator.sample;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class MainBoard extends Mediator {

    /**
     * 光驱设备
     */
    private CDDevice cdDevice;

    /**
     * cpu
     */
    private CPU cpu;

    /**
     * 声卡设备
     */
    private SoundCard soundCard;

    /**
     * 显卡设备
     */
    private GraphicsCard graphicsCard;

    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDevice) {
            handleCD((CDDevice) colleague);
        } else if (colleague == cpu){
            handleCPU((CPU) colleague);
        }
    }

    /**
     * 处理光驱读取数据后与其他设备的交互
     * @param cdDevice
     */
    private void handleCD(CDDevice cdDevice){
        cpu.decodeData(cdDevice.read());
    }
    /**
     * 处理CPU读取数据后与其他设备的交互
     * @param cpu
     */
    private void handleCPU(CPU cpu){
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
