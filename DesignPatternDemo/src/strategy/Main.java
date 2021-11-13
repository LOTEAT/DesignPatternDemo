package strategy;

public class Main {
    public static void main(String[] args){
        Context context = new Context(new Bike());
        context.executeStrategy();
        context = new Context(new Walk());
        context.executeStrategy();
    }
}
