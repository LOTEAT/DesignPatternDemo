package factory;

/**
 * 运输工具制作工厂
 */
public class TransportationFactory {
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
}
