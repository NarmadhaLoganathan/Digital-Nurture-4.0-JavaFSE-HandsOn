public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("sunset.jpg");
        image1.display(); // Loads and displays

        System.out.println("----------");

        image1.display(); // Cached display
    }
}
