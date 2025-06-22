public class OrderSortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 950.0),
            new Order(102, "Bob", 320.5),
            new Order(103, "Charlie", 1200.75),
            new Order(104, "Diana", 560.25)
        };

        System.out.println("Before Sorting (Original Order):");
        for (Order order : orders) order.display();

        // Bubble Sort
        System.out.println("\nAfter Bubble Sort (By Total Price):");
        BubbleSort.sort(orders);
        for (Order order : orders) order.display();

        // Reinitialize for Quick Sort
        orders = new Order[]{
            new Order(101, "Alice", 950.0),
            new Order(102, "Bob", 320.5),
            new Order(103, "Charlie", 1200.75),
            new Order(104, "Diana", 560.25)
        };

        System.out.println("\nAfter Quick Sort (By Total Price):");
        QuickSort.sort(orders, 0, orders.length - 1);
        for (Order order : orders) order.display();
    }
}
