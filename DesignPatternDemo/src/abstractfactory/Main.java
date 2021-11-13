package abstractfactory;

public class Main {
    public static void main(String[] args){
        TransportationFactory factory = new TransportationFactory();
        Transportation ship = factory.getTransportation("ship");
        Transportation car = factory.getTransportation("car");
        Transportation airplane = factory.getTransportation("airplane");
        ship.move();
        car.move();
        airplane.move();
    }
}
