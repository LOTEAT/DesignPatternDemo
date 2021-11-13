package command;

import java.util.ArrayList;
import java.util.List;

/**
 * 接收者类
 */
public class Receiver {
    private List<Order> orderList = new ArrayList<Order>();
    public void receiveOrder(Order order){
        orderList.add(order);
    }
    public void handleOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
