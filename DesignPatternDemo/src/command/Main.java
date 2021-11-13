package command;

public class Main {
    public static void main(String[] args) {
        Transportation transportation = new Transportation();
        GoHome goHome = new GoHome(transportation);
        GoToSchool goToSchool = new GoToSchool(transportation);
        Receiver receiver = new Receiver();
        receiver.receiveOrder(goHome);
        receiver.receiveOrder(goToSchool);
        receiver.handleOrders();
    }
}
