package abstractfactory;

/**
 * 运输工具制作工厂
 */
public class TransportationFactory extends AbstractFactory {
    public Transportation getTransportation(String transportation){
        if(transportation.equals("car"))
            return new Car();
        else if(transportation.equals("airplane"))
            return new Airplane();
        else if(transportation.equals("ship"))
            return new Ship();
        else
            return null;
    }

    public Color getColor(String color){
        return null;
    }

}
