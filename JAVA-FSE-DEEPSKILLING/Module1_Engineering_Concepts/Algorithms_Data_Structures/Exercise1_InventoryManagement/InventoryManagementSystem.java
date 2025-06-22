import java.util.*;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return id + " | " + name + " | Qty: " + quantity + " | Rs." + price;
    }
}

class Inventory {
    Map<Integer, Product> stock = new HashMap<>();

    void insert(Product p) {
        stock.put(p.id, p);
    }

    void modify(int id, int qty, double price) {
        Product p = stock.get(id);
        if (p != null) {
            p.quantity = qty;
            p.price = price;
        }
    }

    void remove(int id) {
        stock.remove(id);
    }

    void listAll() {
        for (Product p : stock.values()) {
            System.out.println(p);
        }
    }
}

public class InventoryManagementSystem
 {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.insert(new Product(1, "Monitor", 15, 8500));
        inv.insert(new Product(2, "Keyboard", 40, 550));
        inv.modify(1, 20, 8300);
        inv.remove(2);
        inv.listAll();
    }
}
