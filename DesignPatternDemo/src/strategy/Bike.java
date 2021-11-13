package strategy;

/**
 * 策略1 乘坐自行车
 */
public class Bike implements Strategy{
    public void go(){
        System.out.println("骑自行车上学");
    }
}
