package abstractfactory;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Transportation getTransportation(String transportation) ;
}
