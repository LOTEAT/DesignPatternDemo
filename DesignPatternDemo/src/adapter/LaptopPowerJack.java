package adapter;

/**
 * 手提电脑
 */
public class LaptopPowerJack implements ElectricalPowerInterface {
    public void charge(){
        System.out.println("使用20V电压充电");
    }
}
