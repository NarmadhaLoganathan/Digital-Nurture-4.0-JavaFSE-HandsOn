public class NotifierTest {
    public static void main(String[] args) {
        // Try to get instance twice
        CustomNotifier first = CustomNotifier.connect();
        CustomNotifier second = CustomNotifier.connect();

        // Send messages
        first.notifyUser("Welcome, Narmadha!");
        second.notifyUser("You have 3 new messages.");

        // Confirm both are same instance
        if (first == second) {
            System.out.println("✅ Single instance used across app.");
        } else {
            System.out.println("❌ Multiple instances created.");
        }
    }
}
