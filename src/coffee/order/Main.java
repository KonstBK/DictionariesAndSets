package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        orderBoard.add("Van Darkholme");
        orderBoard.add("Yoda");
        orderBoard.add("Obi Wan");
        orderBoard.add("John Snow");
        orderBoard.add("Billi Herrington");
        orderBoard.draw();
        orderBoard.deliver();
        orderBoard.deliver(5);
        orderBoard.draw();
    }
}