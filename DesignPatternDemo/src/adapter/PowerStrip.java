package adapter;

/**
 * 拖线板
 */
public class PowerStrip{
    // 供电接口
    private CivilPowerInterface powerInterface;
    // 构造函数
    public PowerStrip(CivilPowerInterface civilPowerInterface){
        powerInterface = civilPowerInterface;
    }
    // 设置电源接口
    public void setPowerInterface(CivilPowerInterface powerInterface){
        this.powerInterface = powerInterface;
    }
    // 供电
    public void charge(){
        powerInterface.charge();
    }
}
