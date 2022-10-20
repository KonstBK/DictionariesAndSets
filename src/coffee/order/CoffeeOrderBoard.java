package coffee.order;

import java.util.*;

public class CoffeeOrderBoard {

    private final Map<Integer, Order> orders = new HashMap<>();
    private Integer nextOrder = 0;

    public CoffeeOrderBoard() {
    }

    public void add(String name){
        nextOrder++;
        this.orders.put(nextOrder, (new Order(name, nextOrder)));
    }

    public void deliver(){
        Integer min = Integer.MAX_VALUE;
        for (Integer key : orders.keySet()) {
            if (key < min){
                min = key;
            }
        }
        orders.remove(min);
    }

    public void deliver(int numberOfOrder){
        for (Integer key : orders.keySet()) {
            if (key.equals(numberOfOrder)){
                orders.remove(key);
                break;
            }
        }
    }

    public void draw(){
        StringBuilder messageToDraw = new StringBuilder("=============\nNum   |  Name\n");
        for (Map.Entry<Integer, Order> integerStringEntry : orders.entrySet()) {
            messageToDraw
                    .append(integerStringEntry.getKey())
                    .append("     |  ")
                    .append(integerStringEntry.getValue())
                    .append("\n");
        }
        System.out.println(messageToDraw);
    }
}
