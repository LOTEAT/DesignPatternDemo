package adapter;

/**
 * 电源适配器
 */
public class PowerAdapter implements CivilPowerInterface {
    private LaptopPowerJack laptopPowerJack;


    public PowerAdapter(LaptopPowerJack laptopPowerJack){
        this.laptopPowerJack = laptopPowerJack;
    }
    @Override
    public void charge(){
        System.out.println("电源适配器转换");
        laptopPowerJack.charge();
    }
}
