public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Mobile", "Electronics"),
            new Product(4, "Watch", "Accessories")
        };

        String searchName = "Mobile";

        int linearIndex = LinearSearch.search(products, searchName);
        System.out.println("Linear Search Result: " + (linearIndex != -1 ? "Found at index " + linearIndex : "Not Found"));

        int binaryIndex = BinarySearch.search(products, searchName);
        System.out.println("Binary Search Result: " + (binaryIndex != -1 ? "Found at index " + binaryIndex : "Not Found"));
    }
}
