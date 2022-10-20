package coffee.order;

import java.util.LinkedList;

public class CoffeeOrderBoard {

    private final LinkedList<Order> orders;

    public CoffeeOrderBoard() {
        this.orders = new LinkedList<>();
    }

    public void add(String name){
        int orderNumber = 1;
        if (!orders.isEmpty()) {
            orderNumber = orders.getLast().getOrderNumber()+1;
        }
        orders.add(new Order(name, orderNumber));
    }

    public void deliver(){
        System.out.println(orders.removeFirst());
    }

    public void deliver(int numberOfOrder){
        for (Order order : orders) {
            if (order.getOrderNumber() == numberOfOrder){
                System.out.println(order);
                orders.remove(order);
                break;
            }
        }
    }

    public void draw(){
        StringBuilder messageToDraw = new StringBuilder("=============\nNum   |  Name\n");
        for (Order order : orders) {
            messageToDraw.append(order.getOrderNumber()).append("     |  ").append(order.getName()).append("\n");
        }
        System.out.println(messageToDraw);
    }
}
