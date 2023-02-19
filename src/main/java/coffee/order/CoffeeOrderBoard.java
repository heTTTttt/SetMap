package coffee.order;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class CoffeeOrderBoard {
    private Map<Integer, String> orders;
    private int orderNumber = 1;

    public CoffeeOrderBoard() {
        orders = new TreeMap<>();
    }

    public void add(String name) {
        orders.put(orderNumber, name);
        orderNumber++;
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            int orderToDeliver = orders.keySet().iterator().next();
            System.out.println("Delivering order #" + orderToDeliver + ": " + orders.get(orderToDeliver));
            orders.remove(orderToDeliver);
        }
    }

    public void deliver(int orderNumber) {
        if (orders.containsKey(orderNumber)) {
            System.out.println("Delivering order #" + orderNumber + ": " + orders.get(orderNumber));
            orders.remove(orderNumber);
        } else {
            System.out.println("Order #" + orderNumber + " not found.");
        }
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Map.Entry<Integer, String> entry : orders.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
