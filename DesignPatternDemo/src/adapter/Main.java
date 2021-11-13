package adapter;

public class Main {
    public static void main(String[] args){
        PowerOutlet powerOutlet = new PowerOutlet();
        PowerStrip powerStrip = new PowerStrip(powerOutlet);
        LaptopPowerJack laptopPowerJack = new LaptopPowerJack();
        PowerAdapter powerAdapter = new PowerAdapter(laptopPowerJack);
        powerStrip.setPowerInterface(powerAdapter);
        powerStrip.charge();
    }
}
