package coffee.order;

public class Order {

    private final String name;
    private final int orderNumber;

    public Order(String name, int order) {
        this.name = name;
        this.orderNumber = order;
    }

    public String getName() {
        return name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
