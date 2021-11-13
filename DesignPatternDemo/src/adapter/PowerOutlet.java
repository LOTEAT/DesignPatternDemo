package adapter;

/**
 * 电源插座
 */
public class PowerOutlet implements CivilPowerInterface {
    public void charge(){
        System.out.println("提供220V电压");
    }
}
