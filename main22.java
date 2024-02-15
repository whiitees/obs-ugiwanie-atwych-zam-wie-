import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private List<Item> items;

    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("- " + item);
        }
    }
}

class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return quantity + " x " + name + " ($" + price + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, "John Doe", 100);
        order.addItem(new Item("Product 1", 2, 25));
        order.addItem(new Item("Product 2", 1, 50));
        order.displayOrderDetails();
    }
}
