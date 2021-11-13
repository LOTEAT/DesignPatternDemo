package abstractfactory;

/**
 * 油漆喷涂工厂
 */
public class ColorFactory extends AbstractFactory{
    public Color getColor(String color){
        if(color.equals("red"))
            return new Red();
        else if(color.equals("black"))
            return new Black();
        else
            return null;
    }
    public Transportation getTransportation(String transportation){
        return null;
    }
}
